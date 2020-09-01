package shuati;

import javafx.util.Pair;

import java.util.*;

/**
 *
 *
 * 127. 单词接龙
 * 题目描述:
 *     给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 *          每次转换只能改变一个字母。
 *          转换过程中的中间单词必须是字典中的单词。
 *
 *
 */
public class LadderLength {

    /**
     * 方法 1：广度优先搜索
     * 思路 参考LeeCode
     *  复杂度分析
     *      时间复杂度：O(M×N)，其中 MM 是单词的长度 NN 是单词表中单词的总数。找到所有的变换需要对每个单词做 MM 次操作。同时，最坏情况下广度优先搜索也要访问所有的 NN 个单词。
     *      空间复杂度：O(M×N)，要在 all_combo_dict 字典中记录每个单词的 MM 个通用状态。访问数组的大小是 NN。广搜队列最坏情况下需要存储 NN 个单词。
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        // Since all words are of same length.
        int L = beginWord.length();

        // Dictionary to hold combination of words that can be formed,
        // from any given word. By changing one letter at a time.
        Map<String, List<String>> allComboDict = new HashMap<>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                        // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<>();
        Q.add(new Pair(beginWord, 1));

        // Visited to make sure we don't repeat processing same word.
        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }


    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {

        int begin_length = beginWord.length();

        Map<String, List<String>> allComboDict = new HashMap<>();

        wordList.forEach(word -> {
            for (int i = 0; i < begin_length; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, begin_length);
                List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
                transformations.add(word);
                allComboDict.put(newWord, transformations);
            }
        });

        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord,1));

        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        while (!queue.isEmpty()){
            Pair<String, Integer> node = queue.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < begin_length; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, begin_length);

                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {
                    if (adjacentWord.equals(endWord)) {
                       return level + 1;
                    }
                    if (!visited.containsKey(adjacentWord)){
                        visited.put(adjacentWord, true);
                        queue.add(new Pair<>(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }

}
