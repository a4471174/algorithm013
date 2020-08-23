# 学习心得

    13期-刷题狂魔组 第三周(周一~周五)算法题 完成了1遍, 但是本周课程课后练习还没开始.
    补充了 第1周的 学习心得与笔记: https://github.com/a4471174/algorithm013/blob/master/Week_01/README.md
    补充了 第2周的 学习心得与笔记: https://github.com/a4471174/algorithm013/blob/master/Week_02/README.md
    希望后面自己可以跟上节奏.



# 学习笔记

# 第3周 第7课 | 泛型递归、树的递归

##   1. 递归的实现、特性以及思维要点
    递归 Recursion
        • 在数学与计算机科学中，是指在函数的定义中使用函数自身的方法。
        Java 代码模版
            public void recur(int level, int param) {
                
                // terminator
                if (level > MAX_LEVEL) {
                // process result
                return;
                }
                
                // process current logic
                process(level, param);
                
                // drill down
                recur( level: level + 1, newParam);
                
                // restore current status
            }
        思维要点
            1. 不要人肉进行递归（最大误区）
            2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
            3. 数学归纳法思维

##   2. 实战题目解析：爬楼梯、括号生成等问题
    实战题目
        爬楼梯（阿里巴巴、腾讯、字节跳动在半年内面试常考）                                   @todo
        括号生成 (字节跳动在半年内面试中考过)                                              @todo
        翻转二叉树 (谷歌、字节跳动、Facebook 在半年内面试中考过)                            @todo
        验证二叉搜索树（亚马逊、微软、Facebook 在半年内面试中考过）                          @todo
        二叉树的最大深度（亚马逊、微软、字节跳动在半年内面试中考过）                          @todo
        二叉树的最小深度（Facebook、字节跳动、谷歌在半年内面试中考过）                       @todo
        二叉树的序列化与反序列化（Facebook、亚马逊在半年内面试常考）                         @todo
    课后作业
        二叉树的最近公共祖先（Facebook 在半年内面试常考）                                  @todo
        从前序与中序遍历序列构造二叉树（字节跳动、亚马逊、微软在半年内面试中考过）              @todo
        组合（微软、亚马逊、谷歌在半年内面试中考过）                                        @todo
        全排列（字节跳动在半年内面试常考）                                                 @todo
        全排列 II （亚马逊、字节跳动、Facebook 在半年内面试中考过）                         @todo

# 第3周 第8课 | 分治、回溯
    
##   1. 分治、回溯的实现和特性
    分治
        • 在计算机科学中，分治法是建基于多项分支递归的一种很重要的算法范式。
        • 把一个复杂的问题分成两个或更多的相同或相似的子问题，直到最后子问题可以简单的直接求解，原问题的解即子问题的解的合并。
        https://zh.wikipedia.org/wiki/%E5%88%86%E6%B2%BB%E6%B3%95
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%88%86%E6%B2%BB%E6%B3%95
            百度百科:
                https://baike.baidu.com/item/%E5%88%86%E6%B2%BB%E6%B3%95
                
    回溯
        • 回溯法（英语：backtracking）是暴力搜索法中的一种。
        • 对于某些计算问题而言，回溯法是一种可以找出所有（或一部分）解的一般性算法，尤其适用于约束补偿问题（在解决约束满足问题时，我们逐步构造更多的候选解，并且在确定某一部分候选解不可能补全成正确解之后放弃继续搜索这个部分候选解本身及其可以拓展出的子候选解，转而测试其他的部分候选解）。
        • 回溯法采用试错的思想，它尝试分步的去解决一个问题。在分步解决问题的过程中，当它通过尝试发现现有的分步答案不能得到有效的正确的解答的时候，它将取消上一步甚至是上几步的计算，再通过其它的可能的分步解答再次尝试寻找问题的答案。回溯法通常用最简单的递归方法来实现，在反复重复上述的步骤后可能出现两种情况：
            找到一个可能存在的正确的答案
            在尝试了所有可能的分步方法后宣告该问题没有答案
            在最坏的情况下，回溯法会导致一次复杂度为指数时间的计算。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%9B%9E%E6%BA%AF%E6%B3%95
            百度百科:
                https://baike.baidu.com/item/%E5%9B%9E%E6%BA%AF/23724802#viewPageContent
                                            
##   2. 实战题目解析：Pow(x,n)、子集
    实战题目
        Pow(x, n) （Facebook 在半年内面试常考）                                           @todo
        子集（Facebook、字节跳动、亚马逊在半年内面试中考过）                                 @todo                          
                         
##   3. 实战题目解析：电话号码的字母组合、N皇后
    实战题目
        多数元素 （亚马逊、字节跳动、Facebook 在半年内面试中考过）                           @todo
        电话号码的字母组合（亚马逊在半年内面试常考）                                         @todo
        N 皇后（字节跳动、苹果、谷歌在半年内面试中考过）                                     @todo

  
            
# 13期-刷题狂魔组 算法题
    Week03
    【day15】二叉树的中序遍历		https://leetcode-cn.com/problems/binary-tree-inorder-traversal/					@UNDERWAY  2 time
                                https://github.com/a4471174/algorithm013/blob/master/Week_03/InorderTraversal.java
    
    【day16】替换空格				https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/							@UNDERWAY  2 time
                                https://github.com/a4471174/algorithm013/blob/master/Week_03/ReplaceSpace.java
    
    【day17】从尾到头打印链表		https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/		@UNDERWAY  2 time
                                https://github.com/a4471174/algorithm013/blob/master/Week_03/ReversePrint.java
                                
    【day18】二叉树的最近公共祖先	https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/	@UNDERWAY  2 time
                                https://github.com/a4471174/algorithm013/blob/master/Week_03/LowestCommonAncestor.java
                                
    【day19】两数之和				https://leetcode-cn.com/problems/two-sum/										@UNDERWAY  2 time 
                                https://github.com/a4471174/algorithm013/blob/master/Week_03/TwoSum2.java