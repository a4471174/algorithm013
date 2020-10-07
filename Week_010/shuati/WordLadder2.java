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
public class WordLadder2 {

    /**
     * 方法 1：广度优先搜索
     * 思路 参考LeeCode 官方
     *      1. 计算单词长度 word_length
     *      2. 构建Map
     *          key: 把wordList中每个单词, 任意一个字母替换成*, 形成的新字符串
     *          val: 原wordList中每个单词.
     *      3. 广度优先遍历
     *          a. 构建队列Queue<Pair<String, Integer>> queue,  从中添加  beginWord,并设置level为1
     *              队列元素: Pair<String, Integer>,
     *                  Pair类:
     *                          key: 单词,val: 层级
     *          b. 构建Map<String, Boolean> visited,确保不重复处理相同单词
     *                  key: 单词,val: 是否已访问
     *          c. 遍历队列queue
     *
     * 复杂度分析
     *      时间复杂度：O(M×N)，其中 M 是单词的长度 N 是单词表中单词的总数。找到所有的变换需要对每个单词做 M 次操作。同时，最坏情况下广度优先搜索也要访问所有的 N 个单词。
     *      空间复杂度：O(M×N)，要在 all_combo_dict 字典中记录每个单词的 M 个通用状态。访问数组的大小是 N。广搜队列最坏情况下需要存储 N 个单词。
     */
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
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
