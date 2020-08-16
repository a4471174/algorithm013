# 学习心得

    13期-刷题狂魔组 第二周(周一~周五)算法题 完成了1遍, 但是本周课程课后练习还没开始.
    补充了 第1周的 学习心得与笔记: https://github.com/a4471174/algorithm013/blob/master/Week_01/README.md
    希望后面自己可以跟上节奏.



# 学习笔记

# 第2周 第5课 | 哈希表、映射、集合

##   1. 哈希表、映射、集合的实现与特性
    Hash table    
        • 散列表（Hash table，也叫哈希表），是根据键（Key）而直接访问在内存储存位置的数据结构。
        • 通过计算一个关于键值的函数，将所需查询的数据映射到表中一个位置来访问记录，这加快了查找速度，这个映射函数称做散列函数。
        • 存放记录的数组称做散列表。 
        • 对不同的关键字可能得到同一散列地址，这种现象称为冲突（英语：Collision）。      
        复杂度：
            时间复杂度：
               平均时间复杂度: O(1),最坏时间复杂度:O(n)
        程序实现: 
            Java
                HashMap, HashTable ...  
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%93%88%E5%B8%8C%E8%A1%A8
            百度百科:
                https://baike.baidu.com/item/%E5%93%88%E5%B8%8C%E8%A1%A8/5981869?fr=aladdin
            博文：
                哈希表—什么是哈希表 https://www.jianshu.com/p/4e64fce04a38
                数据结构之哈希（hash）表 https://www.cnblogs.com/s-b-b/p/6208565.html
                谈谈哈希表 https://zhuanlan.zhihu.com/p/30121142
                Java 集合框架 https://www.runoob.com/java/java-collections.html

##   2. 实战题目解析：有效的字母异位词等问题
    实战题目 / 课后作业                                                        @todo
    有效的字母异位词（亚马逊、Facebook、谷歌在半年内面试中考过）                    @todo
    字母异位词分组（亚马逊在半年内面试中常考）                                    @todo
    两数之和（亚马逊、字节跳动、谷歌、Facebook、苹果、微软、腾讯在半年内面试中常考）  @todo

# 第2周 第6课 | 树、二叉树、二叉搜索树

##   1. 树、二叉树、二叉搜索树的实现和特性
    Tree
        • 树（英语：tree）是一种抽象数据类型（ADT）或是实现这种抽象数据类型的数据结构，用来模拟具有树状结构性质的数据集合。
        • 由n（n>0）个有限节点组成一个具有层次关系的集合。
        • 每个节点都只有有限个子节点或无子节点；
        • 没有父节点的节点称为根节点；
        • 每一个非根节点有且只有一个父节点；
        • 除了根节点外，每个子节点可以分为多个不相交的子树；
        • 树里面没有环路(cycle)   
        种类:
            无序树：树中任意节点的子结点之间没有顺序关系，这种树称为无序树,也称为自由树;
            有序树：树中任意节点的子结点之间有顺序关系，这种树称为有序树；
            二叉树：每个节点最多含有两个子树的树称为二叉树；
            满二叉树：叶节点除外的所有节点均含有两个子树的树被称为满二叉树
            完全二叉树：有 个节点的满二叉树称为完全二叉树
            哈夫曼树（最优二叉树）：带权路径最短的二叉树称为哈夫曼树或最优二叉树；                   
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E6%A0%91_(%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84)
            百度百科:
                https://baike.baidu.com/item/%E6%A0%91/2699484
            博文：
                数据结构中各种树 https://www.jianshu.com/p/2b9558c0e06a
                数据结构树(Tree)详解 https://blog.csdn.net/wannuoge4766/article/details/83998377
                数据结构之树 http://data.biancheng.net/tree/
                数据结构—树 https://www.cnblogs.com/jiangxin/p/11810772.html

    Binary Tree
        • 二叉树（英语：Binary tree）是每个节点最多只有两个分支（即不存在分支度大于2的节点）的树结构。          
        复杂度：
            时间复杂度：          
        二叉树遍历 Pre-order/In-order/Post-order    
            1.前序（Pre-order）：根-左-右
            2.中序（In-order）：左-根-右
            3.后序（Post-order）：左-右-根
        参考：
            维基百科: 
                https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%8F%89%E6%A0%91
            百度百科:
                https://baike.baidu.com/item/%E4%BA%8C%E5%8F%89%E6%A0%91
            博文：   
                什么是二叉树，二叉树及其性质详解 http://data.biancheng.net/view/192.html
                浅谈数据结构-二叉树 https://www.cnblogs.com/polly333/p/4740355.html
                二叉树的详解与实现 https://blog.csdn.net/hellowd123/article/details/99692395
                
    Binary Search Tree   
        • 二叉查找树（英语：Binary Search Tree），也称为二叉搜索树、有序二叉树（ordered binary tree）或排序二叉树（sorted binary tree），是指一棵空树或者具有下列性质的二叉树：   
            若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
            若任意节点的右子树不空，则右子树上所有节点的值均大于或等于它的根节点的值；
            任意节点的左、右子树也分别为二叉查找树；       
        复杂度：
            时间复杂度：  O(logN)            
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%85%83%E6%90%9C%E5%B0%8B%E6%A8%B9
            百度百科:
                https://baike.baidu.com/item/%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91
            博文：
                二叉排序树（二叉查找树、二叉搜索树） https://blog.csdn.net/rodman177/article/details/89771156
                二叉搜索树 https://www.cnblogs.com/LydiammZuo/p/11893982.html
                数据结构（二）：二叉搜索树（Binary Search Tree） https://www.jianshu.com/p/ff4b93b088eb
                                        
##   2. 实战题目解析：二叉树的中序遍历
    二叉树的中序遍历（亚马逊、微软、字节跳动在半年内面试中考过）       @todo
    二叉树的前序遍历（谷歌、微软、字节跳动在半年内面试中考过）         @todo
    N 叉树的后序遍历（亚马逊在半年内面试中考过）                     @todo
    N 叉树的前序遍历（亚马逊在半年内面试中考过）                     @todo
    N 叉树的层序遍历                                              @todo

# 第2周 第6课 | 堆和二叉堆、图

##   1. 堆和二叉堆的实现和特性
    Heap        
        • 堆（英语：Heap）是计算机科学中的一种特别的完全二叉树。  
        • 将根节点最大的堆叫做最大堆或大根堆，根节点最小的堆叫做最小堆或小根堆。
        • 常见的堆有二叉堆、斐波那契堆等。
        复杂度：
            时间复杂度：
                build	创建一个空堆                      O(n)
                insert	向堆中插入一个新元素	             O(log n)
                update	将新元素提升使其符合堆的性质	
                get	获取当前堆顶元素的值                   O(1)
                delete	删除堆顶元素                      O(log n)
                heapify	使删除堆顶元素的堆再次成为堆	              
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%A0%86%E7%A9%8D
            百度百科:
                https://baike.baidu.com/item/%E5%A0%86/20606834
            博文：   
                基本数据结构――堆的基本概念及其操作 https://www.cnblogs.com/JVxie/p/4859889.html    
                数据结构：堆（Heap） https://www.jianshu.com/p/6b526aa481b1
                数据结构-堆的实现 https://blog.csdn.net/tuke_tuke/article/details/50357939

    Binary heap  
        • 二叉堆（英语：binary heap）是一种特殊的堆，二叉堆是完全二叉树或者是近似完全二叉树。         
        复杂度：
            时间复杂度：
                插入节点    O(log n)           
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%8F%89%E5%A0%86
            百度百科:
                https://baike.baidu.com/item/%E4%BA%8C%E5%8F%89%E5%A0%86
            博文：   
                二叉堆(最小堆, 最大堆)介绍与实现 https://blog.csdn.net/HinstenyHisoka/article/details/91817687
                二叉堆的实现 https://www.cnblogs.com/zhangbaochong/p/5188288.html
                二叉堆 https://www.jianshu.com/p/6d3a12fe2d04
            
##   2. 实战题目解析：最小的k个数、滑动窗口最大值等问题
    实战例题
        最小的 k 个数（字节跳动在半年内面试中考过）                    @todo
        滑动窗口最大值（亚马逊在半年内面试中常考）                     @todo
    课后作业
        HeapSort ：自学 https://www.geeksforgeeks.org/heap-sort/   @todo
        丑数（字节跳动在半年内面试中考过）                            @todo
        前 K 个高频元素（亚马逊在半年内面试中常考）                    @todo
    
##   3. 图的实现和特性
    Graph      
        • 在数学的分支图论中，图（Graph）用于表示物件与物件之间的关系，是图论的基本研究对象。
        • 一张图由一些小圆点（称为顶点或结点）和连结这些圆点的直线或曲线（称为边）组成。    
        复杂度：
            时间复杂度：              
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%9B%BE_(%E6%95%B0%E5%AD%A6)
            百度百科:
            博文： 
                数据结构之图 https://www.cnblogs.com/xiaoxue126/p/9071441.html  
                数据结构：图（Graph） https://www.jianshu.com/p/bce71b2bdbc8


# 作业
                
# 13期-刷题狂魔组 算法题
    Week02
    【day08】  两个数组的交集     https://github.com/a4471174/algorithm013/blob/master/Week_02/IntersectionOfTwoArrays.java
    【day09】  删除最外层的括号   https://github.com/a4471174/algorithm013/blob/master/Week_02/RemoveOuterParentheses.java
    【day10】  滑动窗口的最大值   https://github.com/a4471174/algorithm013/blob/master/Week_02/SlidingWindowMaximum.java
    【day11】  Fizz Buzz        https://github.com/a4471174/algorithm013/blob/master/Week_02/FizzBuzz.java
    【day12】  各位相加          https://github.com/a4471174/algorithm013/blob/master/Week_02/AddDigits.java
    