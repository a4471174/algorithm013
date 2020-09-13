package shuati;

import javafx.util.Pair;

import java.util.*;

/**
 * 127. 单词接龙
 * 题目描述:
 *      给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：
 *      每次转换只能改变一个字母。
 *      转换过程中的中间单词必须是字典中的单词。
 *      说明:
 *           如果不存在这样的转换序列，返回 0。
 *           所有单词具有相同的长度。
 *           所有单词只由小写字母组成。
 *           字典中不存在重复的单词。
 *           你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
 *
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/word-ladder/solution/dan-ci-jie-long-by-leetcode/
 *          方法 1：广度优先搜索
 *          方法 2：双向广度优先搜索
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *      广度优先搜索： >不理解>理解, 又抄了1遍
 *
 */
public class WordLadder {


    /**
     * 方法 1：广度优先搜索
     * 思路 参考LeeCode 官方
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






    /**
     * 方法 1：广度优先搜索
     * 思路 参考LeeCode liweiwei1419
     */
    public int ladderLength2(String beginWord, String endWord, List<String> wordList) {
        // 第 1 步：先将 wordList 放到哈希表里，便于判断某个单词是否在 wordList 里
        Set<String> wordSet = new HashSet<>(wordList);
        if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
            return 0;
        }
        wordSet.remove(beginWord);

        // 第 2 步：图的广度优先遍历，必须使用队列和表示是否访问过的 visited 哈希表
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        // 第 3 步：开始广度优先遍历，包含起点，因此初始化的时候步数为 1
        int step = 1;
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                // 依次遍历当前队列中的单词
                String currentWord = queue.poll();
                // 如果 currentWord 能够修改 1 个字符与 endWord 相同，则返回 step + 1
                if (changeWordEveryOneLetter(currentWord, endWord, queue, visited, wordSet)) {
                    return step + 1;
                }
            }
            step++;
        }
        return 0;
    }

    /**
     * 尝试对 currentWord 修改每一个字符，看看是不是能与 endWord 匹配
     * @param currentWord
     * @param endWord
     * @param queue
     * @param visited
     * @param wordSet
     * @return
     */
    private boolean changeWordEveryOneLetter(String currentWord, String endWord,
                                             Queue<String> queue, Set<String> visited, Set<String> wordSet) {
        char[] charArray = currentWord.toCharArray();
        for (int i = 0; i < endWord.length(); i++) {
            // 先保存，然后恢复
            char originChar = charArray[i];
            for (char k = 'a'; k <= 'z'; k++) {
                if (k == originChar) {
                    continue;
                }
                charArray[i] = k;
                String nextWord = String.valueOf(charArray);
                if (wordSet.contains(nextWord)) {
                    if (nextWord.equals(endWord)) {
                        return true;
                    }
                    if (!visited.contains(nextWord)) {
                        queue.add(nextWord);
                        // 注意：添加到队列以后，必须马上标记为已经访问
                        visited.add(nextWord);
                    }
                }
            }
            // 恢复
            charArray[i] = originChar;
        }
        return false;
    }







    /**
     * 方法 1：广度优先搜索
     * 思路 参考LeeCode 官方
     *      1. 计算单词长度 word_length
     *      2. 构建Map
     *          key: 把wordList中每个单词, 任意一个字母替换成*, 形成的新字符串
     *          val: 原wordList中每个单词.
     *
     *      3. 广度优先遍历
     *          a. 构建队列Queue<Pair<String, Integer>> queue,  从中添加  beginWord,并设置level为1
     *              队列元素: Pair<String, Integer>,
     *                  Pair类:
     *                          key: 单词,
     *                          val: 层级
     *
     *          b. 构建Map<String, Boolean> visited,确保不重复处理相同单词
     *                  key: 单词,
     *                  val: 是否已访问
     *
     *          c. 遍历队列queue
     *
     * 复杂度分析
     *      时间复杂度：O(M×N)，其中 M 是单词的长度 N 是单词表中单词的总数。找到所有的变换需要对每个单词做 M 次操作。同时，最坏情况下广度优先搜索也要访问所有的 N 个单词。
     *      空间复杂度：O(M×N)，要在 all_combo_dict 字典中记录每个单词的 M 个通用状态。访问数组的大小是 N。广搜队列最坏情况下需要存储 N 个单词。
     */
    public int ladderLength3(String beginWord, String endWord, List<String> wordList) {
        //1. 计算单词长度
        int word_length = beginWord.length(); // 单词长度
        //2. 构建Map, 键: 把wordList中每个单词, 任意一个字母替换成'*', 形成的新字符串. 值: 原wordList中每个单词.
        Map<String, List<String>> allComboDict = new HashMap<>();
        wordList.forEach(word ->{
            for (int i = 0; i < word_length; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, word_length);
                List<String> transformations = allComboDict.getOrDefault(newWord, new ArrayList<>());
                transformations.add(word);
                allComboDict.put(newWord, transformations);
            }
        });

        //3. 广度优先遍历
        //a. 构建队列, 从中添加  beginWord,并设置level为1
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));
        //b. 构建visited,确保不重复处理相同单词
        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);
        //c. 遍历队列
        while (!queue.isEmpty()) {
            //从队列头部删除一个元素,并返回元素
            Pair<String, Integer> node = queue.remove();
            //该元素的key是单词,value是层级
            String word = node.getKey();
            int level = node.getValue();
            //以单词长度进行遍历
            for (int i = 0; i < word_length; i++) {
                //把单词中任意一个字母替换成'*',形成的新字符串
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, word_length);
                //从map(allComboDict)遍历以'newWord'为key的列表.
                //如果 endWord等于列表中的字符串, level + 1
                //visited不含列表中的字符串, visited添加该字符串, 队列添加该字符串.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<>())) {

                    if(adjacentWord.equals(endWord)){
                        return  level + 1;
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
