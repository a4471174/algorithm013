# 学习心得
           
    对于本周的（字典树和并查集\高级搜索\红黑树和AVL树）的内容掌握的不是很好,审题、解题 、编码等都有问题， 需要多巩固练习。
    
    13期-刷题狂魔组 第7周(周一~周日)算法题 完成了1遍, 但课后练习还没开始.
    LeetCode每日一题 刷了一遍, 有些弄懂了, 有些没弄懂.


    多多做题，整理笔记。
    
    希望后面自己可以跟上节奏

   


​    
# 学习笔记

# 第7周 第13课 | 字典树和并查集

##   1. Trie树的基本实现和特性
    Trie树
        • 在计算机科学中，trie，又称前缀树或字典树，是一种有序树，用于保存关联数组，其中的键通常是字符串。
        • 与二叉查找树不同，键不是直接保存在节点中，而是由节点在树中的位置决定。
        • 一个节点的所有子孙都有相同的前缀，也就是这个节点对应的字符串，而根节点对应空字符串。
        • 一般情况下，不是所有的节点都有对应的值，只有叶子节点和部分内部节点所对应的键才有相关的值。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/Trie
            百度百科: https://baike.baidu.com/item/%E5%AD%97%E5%85%B8%E6%A0%91?fromtitle=Trie&fromid=140945
    
##   2. Trie树实战题目解析：单词搜索2
    @todo
    
##   3. 并查集的基本实现、特性和实战题目解析
    并查集
        • 在计算机科学中，并查集是一种树型的数据结构，用于处理一些不交集（Disjoint Sets）的合并及查询问题。
        操作:
            Find：确定元素属于哪一个子集。它可以被用来确定两个元素是否属于同一子集。
            Union：将两个子集合并成同一个集合。
            MakeSet，用于创建单元素集合。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E5%B9%B6%E6%9F%A5%E9%9B%86
            百度百科: https://baike.baidu.com/item/%E5%B9%B6%E6%9F%A5%E9%9B%86
            
# 第7周 第14课｜高级搜索

##   1. 剪枝的实现和特性
    剪枝
        • 剪枝目的在于去掉一些不符合要求的或是浪费时间而没有作用的答案，从而使得深度优先搜索能够更快得到正确答案。
        参考：
            课件： 14 极客大学-算法训练营-覃超-第十四课.pdf
            维基百科: https://zh.wikipedia.org/w/index.php?search=%E5%89%AA%E6%9E%9D&title=Special%3A%E6%90%9C%E7%B4%A2&go=%E5%89%8D%E5%BE%80&ns0=1
                    Alpha-beta剪枝
                    决策树剪枝
            百度百科: https://baike.baidu.com/item/%E5%89%AA%E6%9E%9D/23746718
            
##   2. 剪枝实战题目解析：数独
    @todo
    
##   3. 双向BFS的实现、特性和题解
    双向BFS
        @Warn 没看懂, 以后慢慢看.
        参考：
            https://blog.csdn.net/weixin_43501684/article/details/90147421
            https://leetcode-cn.com/problems/word-ladder/solution/dan-ci-jie-long-by-leetcode/
            https://leetcode-cn.com/problems/word-ladder/solution/yan-du-you-xian-bian-li-shuang-xiang-yan-du-you-2/    
            
##   4. 启发式搜索的实现、特性和题解
    启发式搜索
        • 启发式算法试图一次提供一个或全部目标。
        • 它通常可在合理时间解出答案，但也没办法知道它是否每次都可以这样的速度求解。
        • 启发式算法处理许多实际问题时通常可以在合理时间内得到不错的答案。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E5%90%AF%E5%8F%91%E5%BC%8F%E6%90%9C%E7%B4%A2
            百度百科: https://baike.baidu.com/item/%E5%90%AF%E5%8F%91%E5%BC%8F%E6%90%9C%E7%B4%A2
    @Warn 一知半解, 以后慢慢看.
    
# 第7周 第15课 | 红黑树和AVL树

##   1. AVL树和红黑树的实现和特性
    AVL树
        • 在计算机科学中，AVL树是最早被发明的自平衡二叉查找树
        • 在AVL树中，任一节点对应的两棵子树的最大高度差为1，因此它也被称为高度平衡树。
        • 查找、插入和删除在平均和最坏情况下的时间复杂度都是 O(logn)
        • 增加和删除元素的操作则可能需要借由一次或多次树旋转，以实现树的重新平衡。
        • 节点的平衡因子是它的左子树的高度减去它的右子树的高度（有时相反）。带有平衡因子1、0或 -1的节点被认为是平衡的。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/AVL%E6%A0%91
            百度百科: https://baike.baidu.com/item/AVL%E6%A0%91
            
    红黑树
        • 红黑树（英语：Red–black tree）是一种自平衡二叉查找树，是在计算机科学中用到的一种数据结构，典型用途是实现关联数组
        • 红黑树的结构复杂，但它的操作有着良好的最坏情况运行时间，并且在实践中高效：它可以在 {\displaystyle {\text{O}}(\log n)} {\displaystyle {\text{O}}(\log n)}时间内完成查找、插入和删除
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E7%BA%A2%E9%BB%91%E6%A0%91
            百度百科: https://baike.baidu.com/item/%E7%BA%A2%E9%BB%91%E6%A0%91
            
            
# 13期-刷题狂魔组 算法题


| 天数  | 题目                | 链接                                                                                             | 次数 |
| ----- | ------------------ | ----------------------------------------------------------------------------------------------- | ---- |
| day43 | 搜索二维矩阵        | https://leetcode-cn.com/problems/search-a-2d-matrix/                                             | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/SearchA2dMatrix.java         |      |
| day44 | 实现 Trie (前缀树)  | https://leetcode-cn.com/problems/implement-trie-prefix-tree/                                     | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/ImplementTriePrefixTree.java |      |
| day45 | 岛屿数量            | https://leetcode-cn.com/problems/number-of-islands/                                              | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/NumberOfIslands.java         |      |
| day46 | 最大子序和          | https://leetcode-cn.com/problems/maximum-subarray/                                               | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/MaximumSubarray.java         |      |
| day47 | 单词接龙            | https://leetcode-cn.com/problems/word-ladder/                                                    | 2    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/WordLadder.java              |      |
| day48 | 三数之和            | https://leetcode-cn.com/problems/3sum/                                                           | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/ThreeSum.java                |      |
| day49 | 括号生成            | https://leetcode-cn.com/problems/generate-parentheses/                                           | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_07/shuati/GenerateParentheses.java     |      |
|       |                    |                                                                                                  |      |
                                    