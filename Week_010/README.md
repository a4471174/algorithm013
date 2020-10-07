# 学习心得

    第10周, 发现自己还是有很多没掌握， 需要多巩固练习。
    
    13期-刷题狂魔组 第10周(周一~周日)算法题 完成了1遍, 但课后练习还没开始.
    LeetCode每日一题 刷了一遍, 有些弄懂了, 有些没弄懂.


    开始整理笔记\脑图.    
    
# 学习笔记

# 如何高效学习    
    
    三分看视频理解、七分理解
    • 视频： 1.5~2.0倍数播放、难点（暂停+反复）
    
    摒弃“旧”习惯
    • 五毒神掌、看高手代码
    • 5分钟想不出来,看题解,用五毒神掌。 


# 数据结构与算法总览    

    精通一个领域
    • 知识分解\连接
    • 刻意练习(五毒神掌)
    • 反馈(即时\主动型\被动型反馈)
    
    刷题技巧 
    • 澄清\思考可能解\编码\测试
    
    五步刷题法 五毒神掌
    刷题第一遍
    • 5分钟：读题 + 思考
    • 直接看解法：注意！多解法，比较解法优劣
    • 背诵、默写好的解法
    刷题第二遍
    • 马上自己写 —> LeetCode 提交
    • 多种解法比较、体会 —> 优化！
    刷题第三遍
    • 过了一天后，再重复做题
    • 不同解法的熟练程度 —> 专项练习
    刷题第四遍
    • 过了一周：反复回来练习相同题目
    刷题第五遍
    • 面试前一周恢复性训练
    
    分解数据结构和算法
    数据结构
    • 一维：
        • 基础：数组 array (string), 链表 linked list
        • 高级：栈 stack, 队列 queue, 双端队列 deque, 集合 set, 映射 map (hash or map), etc
    • 二维：
        • 基础：树 tree, 图 graph
        • 高级：二叉搜索树 binary search tree (red-black tree, AVL), 堆 heap, 并查集 disjoint set, 字典树 Trie, etc
    • 特殊：
        • 位运算 Bitwise, 布隆过滤器 BloomFilter
        • LRU Cache
    
    算法
    • If-else, switch —> branch
    • for, while loop —> Iteration
    • 递归 Recursion (Divide & Conquer, Backtrace)
    • 搜索 Search: 深度优先搜索 Depth first search, 广度优先搜索 Breadth first search, A*, etc
    • 动态规划 Dynamic Programming
    • 二分查找 Binary Search
    • 贪心 Greedy
    • 数学 Math , 几何 Geometry
    
    数据结构和算法脑图
    Homework：自己动手绘制一份数据结构和算法脑图 (to do... ...)
    
    线上课程
    •预习 — 基础知识自己预习和查看
    •课堂互动 — 跟着一起思考、回答问题
    •课后作业 — 按照切题办法
    
    小结
        职业训练: 知识点拆分、刻意练习、反馈
        五步刷题法 五毒神掌
        做算法题最大误区： 只做一遍


# 训练准备和复杂度分析

##   1. 训练环境设置、编码技巧和Code Style

    电脑设置
    • Google
    • Mac: iTerm2 + zsh (oh my zsh)
      Windows: Microsoft new terminal:(https://github.com/microsoft/terminal)
    • VSCode; Java: IntelliJ; Python: Pycharm
    • LeetCode plugin (VSCode & IntelliJ)
    • https://vscodethemes.com/

    Code Style
    Java、Python、…
    • Google code style
    • Facebook
    • Airbnb

    LeetCode
    • leetcode-cn.com 和 题解
    • leetcode.com 和 Discuss board
    
    指法和小操作
    • home, end（行头、行尾）
    • Word 单词、选单词、选整行
    • IDE 的自动补全
    • Top tips for <IDE-name>
    
    自顶向下的编程方式
    • https://markhneedham.com/blog/2008/09/15/clean-code-
    book-review/
    • https://leetcode-cn.com/problems/valid-palindrome/
    
##   2. 时间复杂度和空间复杂度分析
    Big O notation
    O(1): Constant Complexity 常数复杂度
    O(log n): Logarithmic Complexity 对数复杂度
    O(n): Linear Complexity 线性时间复杂度
    O(n^2): N square Complexity 平方
    O(n^3): N cubic Complexity 立方
    O(2^n): Exponential Growth 指数
    O(n!): Factorial 阶乘
        注意：只看最高复杂度的运算
        
    空间复杂度
    1. 数组的长度
    2. 递归的深度        
    
# 数组、链表、跳表
    Array
        • 数组（英语：Array），是由相同类型的元素（element）的集合所组成的数据结构，分配一块连续的内存来存储。
        复杂度：
            时间复杂度：
                add： O(n)
                del： O(n)
                get： O(1)
                set： O(1)
        程序实现: 
            Java, C++: int a[100];
            Python: list = []
            JavaScript: let x = [1, 2, 3]
        优劣:
            优点：
                下标确定，查询/修改 快速
            缺点：
                无法改变数组大小。
                随机插入/删除, 需移动数组 
        参考：
            维基百科: 
                https://zh.wikipedia.org/wiki/%E6%95%B0%E7%BB%84  
            百度百科: 
                https://baike.baidu.com/item/%E6%95%B0%E7%BB%84/3794097?fr=aladdin#1_2
            博文:
                数组概述和特点 https://blog.csdn.net/weixin_43003240/article/details/86997751
                数组的特性 https://www.cnblogs.com/ahao214/p/11175482.html
                数组的特点 https://blog.csdn.net/xiaozhang___/article/details/79683945
                Java中数组的特性 https://www.cnblogs.com/zdj-/p/8510306.html
                数组及简介时间复杂度 https://blog.csdn.net/qq_28849965/article/details/84837985
            
    Linked List    
        • 链表由一系列结点（链表中每一个元素称为结点）组成，结点可以在运行时动态生成。
        • 链表是一种物理存储单元上非连续、非顺序的存储结构，元素的逻辑顺序是通过链表中的指针链接次序实现的。
        种类：
            单链表、双链表、循环链表
        复杂度：
            时间复杂度：
                prepend O(1)
                append  O(1)
                lookup  O(n)
                insert  O(1)
                delete  O(1)
        程序实现: 
            Java伪代码
            public class LinkedList<Item> {
                private Node first;
                private class Node {
                    Item data;
                    Node next;
                }
                ...
            }
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E9%93%BE%E8%A1%A8
            百度百科:
                https://baike.baidu.com/item/%E9%93%BE%E8%A1%A8/9794473?fr=aladdin
            博文：
                链表的概念和用法 https://www.jianshu.com/p/838e1502b779
                链表的概念、实践和面试题 https://www.cnblogs.com/csh24/p/12731903.html     
                链表详解（易懂） https://blog.csdn.net/SlimShadyKe/article/details/89503062
                【C语言】链表及单链表基本操作 https://blog.csdn.net/swag_wg/article/details/89673850
                深入理解数据结构之链表 https://www.cnblogs.com/absfree/p/5463372.html  
                 
    Skip List
         • 在计算机科学中，跳跃列表是一种数据结构。它使得包含n个元素的有序序列的查找和插入操作的平均时间复杂度都是O(log n)，优于数组的O(n)复杂度。
         复杂度：
            时间复杂度：
                O(log n)
            空间复杂度：
                O(n)
         程序实现:  
             Java伪代码
             public class SkipList {
                 private static final int MAX_LEVEL = 16;
                 private int levelCount = 1;
                 private Node head = new Node();
                 private Random random = new Random();
                 public Node find(int value){}
                 public void insert(int value){}
                 public void delete(int value){}
                 private int randomLevel() {}
                 class Node{
                     private int data;
                     private Node[] forwards = new Node[MAX_LEVEL];
                     private int maxLevel;
                 }
             }
         工程应用：
            LRU Cache - Linked list
                https://www.jianshu.com/p/b1ab4a170c3c
                https://leetcode-cn.com/problems/lru-cache
            Redis - Skip List
                https://redisbook.readthedocs.io/en/latest/internal-datastruct/skiplist.html
                https://www.zhihu.com/question/20202931
         参考：
             维基百科:
                https://zh.wikipedia.org/wiki/%E8%B7%B3%E8%B7%83%E5%88%97%E8%A1%A8
             百度百科:
                https://baike.baidu.com/item/%E8%B7%B3%E8%A1%A8
             博文：
                跳表(skip list) https://www.jianshu.com/p/43039adeb122
                跳表的原理及实例 https://www.cnblogs.com/lfri/p/9991925.html
                数据结构与算法——跳表 https://zhuanlan.zhihu.com/p/68516038
                什么是跳表 https://blog.csdn.net/u010293702/article/details/77075276
    
    小结    
    • 数组、链表、跳表的原理和实现
    • 三者的时间复杂度、空间复杂度
    • 工程运用
    • 跳表：升维思想 + 空间换时间
 
    
# 栈、队列、优先队列、双端队列    
    Stack    
        • 堆栈（英语：stack）又称为栈或堆叠，是计算机科学中的一种抽象数据类型，只允许在有序的线性数据集合的一端（称为堆栈顶端，英语：top）进行加入数据（英语：push）和移除数据（英语：pop）的运算。因而按照后进先出（LIFO, Last In First Out）的原理运作。       
        复杂度：
            时间复杂度：
                添加、删除皆为 O(1)        
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%A0%86%E6%A0%88
            百度百科:
                https://baike.baidu.com/item/%E6%A0%88/12808149
            博文：
                栈（链式栈）----C语言 https://www.cnblogs.com/lanhaicode/p/10463156.html
                C++数据结构——栈 https://blog.csdn.net/zichen_ziqi/article/details/80807989
                栈 https://www.jianshu.com/p/ef4d9a897702
                    
    Queue
        • 队列，又称为伫列（queue），计算机科学中的一种抽象资料型别，是先进先出（FIFO, First-In-First-Out）的线性表。在具体应用中通常用链表或者数组来实现。队列只允许在后端（称为rear）进行插入操作，在前端（称为front）进行删除操作。
        种类：
            有界队列/无界队列、阻塞队列/非阻塞队列、链式队列/循环队列/单向队列/双端队列、优先队列
        复杂度：
            时间复杂度：
                添加、删除皆为 O(1)
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E9%98%9F%E5%88%97
            百度百科:
                https://baike.baidu.com/item/%E9%98%9F%E5%88%97/14580481
            博文：
                队列 https://www.cnblogs.com/litran/p/10541114.html
                数据结构-队列 https://www.cnblogs.com/TimVerion/p/11194552.html
                队列基本操作 https://blog.csdn.net/zhang21722668/article/details/82155301
                队列分类 https://blog.csdn.net/qiaofengzxq/article/details/102671885
                队列分类梳理 https://www.cnblogs.com/frankltf/p/10345168.html
                队列分类实现 https://www.cnblogs.com/lulipro/p/7498459.html        


# 哈希表、映射、集合
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


# 堆和二叉堆、图                
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


# 泛型递归、树的递归
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


# 分治、回溯
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
 
                                            
# 深度优先搜索和广度优先搜索
    深度优先搜索
        • 深度优先搜索算法（英语：Depth-First-Search，DFS）是一种用于遍历或搜索树或图的算法。
        • 这个算法会尽可能深的搜索树的分支。当节点v的所在边都己被探寻过，搜索将回溯到发现节点v的那条边的起始节点。这一过程一直进行到已发现从源节点可达的所有节点为止。如果还存在未被发现的节点，则选择其中一个作为源节点并重复以上过程，整个进程反复进行直到所有节点都被访问为止。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2
            百度百科:
                https://baike.baidu.com/item/%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2
        DFS 代码 - 递归写法
            visited = set()
            
            def dfs(node, visited):
                if node in visited: # terminator
                    # already visited
                    return
     
            visited.add(node)
            
            # process current node here.
            ...
            for next_node in node.children():
                if not next_node in visited:
                    dfs(next_node, visited)            
         
        DFS 代码 - 非递归写法
            def DFS(self, tree):
                if tree.root is None:
                    return []
            
            visited, stack = [], [tree.root]
            
            while stack:
                node = stack.pop()
                visited.add(node)
                process (node)
                nodes = generate_related_nodes(node)
                stack.push(nodes)
            # other processing work     
                            
    广度优先搜索
        • 广度优先搜索算法（英语：Breadth-First Search，缩写为BFS），又译作宽度优先搜索，或横向优先搜索，是一种图形搜索算法。
        • BFS是从根节点开始，沿着树的宽度遍历树的节点。如果所有节点均被访问，则算法中止。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E5%B9%BF%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2
            百度百科:
                https://baike.baidu.com/item/%E5%AE%BD%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2/5224802?fromtitle=%E5%B9%BF%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2&fromid=2148012
        BFS 代码
            def BFS(graph, start, end):
                queue = []
                queue.append([start])
                visited.add(start)
            
            while queue:
                node = queue.pop()
                visited.add(node)
                
                process(node)
                nodes = generate_related_nodes(node)
                queue.push(nodes)    
         
            
# 贪心算法
    贪心算法
        • 贪心算法（英语：greedy algorithm），又称贪婪算法，是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是最好或最优的算法。。
        • 贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95
            百度百科:
                https://baike.baidu.com/item/%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95

# 二分查找
    二分查找
        • 在计算机科学中，二分查找算法（英语：binary search algorithm），也称折半搜索算法（英语：half-interval search algorithm）[1]、对数搜索算法（英语：logarithmic search algorithm）[2]，是一种在有序数组中查找某一特定元素的搜索算法。
        • 搜索过程从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。
        复杂度分析:
            二分查找算法在情况下的复杂度是对数时间，进行O(log n)次比较操作
            二分查找算法使用常数空间，无论对任何大小的输入数据，算法使用的空间都是一样的O(1)。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E4%BA%8C%E5%88%86%E6%90%9C%E5%B0%8B%E6%BC%94%E7%AE%97%E6%B3%95
            百度百科:
                https://baike.baidu.com/item/%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE

  
#  动态规划
    动态规划
        • 动态规划（英语：Dynamic programming，简称DP）是一种在数学、管理科学、计算机科学、经济学和生物信息学中使用的，通过把原问题分解为相对简单的子问题的方式求解复杂问题的方法。
        • 动态规划常常适用于有重叠子问题[1]和最优子结构性质的问题，动态规划方法所耗时间往往远少于朴素解法。
        • 若要解一个给定问题，需要解其不同部分（即子问题），再根据子问题的解以得出原问题的解。
        • 通常许多子问题非常相似，为此动态规划法试图仅仅解决每个子问题一次，从而减少计算量：一旦某个给定子问题的解已经算出，则将其记忆化存储，以便下次需要同一个子问题解之时直接查表。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92
            百度百科: https://baike.baidu.com/item/%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92


#  字典树和并查集
    Trie树
        • 在计算机科学中，trie，又称前缀树或字典树，是一种有序树，用于保存关联数组，其中的键通常是字符串。
        • 与二叉查找树不同，键不是直接保存在节点中，而是由节点在树中的位置决定。
        • 一个节点的所有子孙都有相同的前缀，也就是这个节点对应的字符串，而根节点对应空字符串。
        • 一般情况下，不是所有的节点都有对应的值，只有叶子节点和部分内部节点所对应的键才有相关的值。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/Trie
            百度百科: https://baike.baidu.com/item/%E5%AD%97%E5%85%B8%E6%A0%91?fromtitle=Trie&fromid=140945
    
    并查集
        • 在计算机科学中，并查集是一种树型的数据结构，用于处理一些不交集（Disjoint Sets）的合并及查询问题。
        操作:
            Find：确定元素属于哪一个子集。它可以被用来确定两个元素是否属于同一子集。
            Union：将两个子集合并成同一个集合。
            MakeSet，用于创建单元素集合。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E5%B9%B6%E6%9F%A5%E9%9B%86
            百度百科: https://baike.baidu.com/item/%E5%B9%B6%E6%9F%A5%E9%9B%86
         
            
# 高级搜索
    剪枝
        • 剪枝目的在于去掉一些不符合要求的或是浪费时间而没有作用的答案，从而使得深度优先搜索能够更快得到正确答案。
        参考：
            课件： 14 极客大学-算法训练营-覃超-第十四课.pdf
            维基百科: https://zh.wikipedia.org/w/index.php?search=%E5%89%AA%E6%9E%9D&title=Special%3A%E6%90%9C%E7%B4%A2&go=%E5%89%8D%E5%BE%80&ns0=1
                    Alpha-beta剪枝
                    决策树剪枝
            百度百科: https://baike.baidu.com/item/%E5%89%AA%E6%9E%9D/23746718
    
    双向BFS
        @Warn 没看懂, 以后慢慢看.
        参考：
            https://blog.csdn.net/weixin_43501684/article/details/90147421
            https://leetcode-cn.com/problems/word-ladder/solution/dan-ci-jie-long-by-leetcode/
            https://leetcode-cn.com/problems/word-ladder/solution/yan-du-you-xian-bian-li-shuang-xiang-yan-du-you-2/    

    启发式搜索
        • 启发式算法试图一次提供一个或全部目标。
        • 它通常可在合理时间解出答案，但也没办法知道它是否每次都可以这样的速度求解。
        • 启发式算法处理许多实际问题时通常可以在合理时间内得到不错的答案。
        参考：
            维基百科: https://zh.wikipedia.org/wiki/%E5%90%AF%E5%8F%91%E5%BC%8F%E6%90%9C%E7%B4%A2
            百度百科: https://baike.baidu.com/item/%E5%90%AF%E5%8F%91%E5%BC%8F%E6%90%9C%E7%B4%A2
    @Warn 一知半解, 以后慢慢看.
    
#  红黑树和AVL树
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
            
#  位运算
    二进制（binary）在数学和数字电路中指以2为基数的记数系统，以2为基数代表系统是二进位制的。
    
    位运算符
        • 左移     << 
        • 右移     >> 
        • 按位或   ︳
        • 按位与    &
        • 按位取反  ~ 
        • 按位异或  ^
        参考
            维基百科: https://zh.wikipedia.org/wiki/%E4%BA%8C%E8%BF%9B%E5%88%B6
                     https://zh.wikipedia.org/wiki/%E4%BD%8D%E6%93%8D%E4%BD%9C
            百度百科: https://baike.baidu.com/item/%E4%BA%8C%E8%BF%9B%E5%88%B6
                     https://baike.baidu.com/item/%E4%BD%8D%E8%BF%90%E7%AE%97
                 
    指定位置的位运算
        1. 将 x 最右边的 n 位清零：x & (~0 << n)
        2. 获取 x 的第 n 位值（0 或者 1）： (x >> n) & 1
        3. 获取 x 的第 n 位的幂值：x & (1 << n)
        4. 仅将第 n 位置为 1：x | (1 << n)
        5. 仅将第 n 位置为 0：x & (~ (1 << n))
        6. 将 x 最高位至第 n 位（含）清零：x & ((1 << n) - 1)         
        
    实战位运算要点
        判断奇偶：
        x % 2 == 1 —> (x & 1) == 1
        x % 2 == 0 —> (x & 1) == 0
        • x >> 1 —> x / 2.
        即： x = x / 2; —> x = x >> 1;
        mid = (left + right) / 2; —> mid = (left + right) >> 1;
        • X = X & (X-1) 清零最低位的 1
        • X & -X => 得到最低位的 1
        • X & ~X => 0
    

#  布隆过滤器和LRU缓存
    布隆过滤器
        • 实际上是一个很长的二进制向量和一系列随机映射函数。
        • 布隆过滤器可以用于检索一个元素是否在一个集合中。
        • 优点是空间效率和查询时间都远远超过一般的算法，缺点是有一定的误识别率和删除困难。
        参考
            维基百科: https://zh.wikipedia.org/wiki/%E5%B8%83%E9%9A%86%E8%BF%87%E6%BB%A4%E5%99%A8
            百度百科: https://baike.baidu.com/item/%E5%B8%83%E9%9A%86%E8%BF%87%E6%BB%A4%E5%99%A8

    Cache
        • 凡是位于速度相差较大的两种硬件之间，用于协调两者数据传输速度差异的结构，均可称之为Cache
        • 缓存置换策略: 最久未使用算法（LFU）、先进先出算法（FIFO）、最近最少使用算法（LRU）、非最近使用算法（NMRU）等
        参考
            维基百科: https://zh.wikipedia.org/wiki/%E7%BC%93%E5%AD%98
            百度百科: https://baike.baidu.com/item/%E7%BC%93%E5%AD%98
                    
    LRU Cache
        • 两个要素： 大小 、替换策略   
        • Hash Table + Double LinkedList 
        参考    
            百度百科: https://baike.baidu.com/item/LRU
            
#  排序算法
    排序算法
        • 比较类排序：通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn)，因此也称为非线性时间比较类排序。
                      交换排序：冒泡排序、快速排序
                      插入排序：简单插入排序、希尔排序
                      选择排序：简单选择排序、堆排序
                      归并排序：二路归并排序、多路归并排序
        • 非比较类排序：不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此也称为线性时间非比较类排序。
                      计数排序、桶排序、基数排序 
     
    初级排序 - O(n^2)   
        • 选择排序（Selection Sort）每次找最小值，然后放到待排序数组的起始位置。
        • 插入排序（Insertion Sort）从前到后逐步构建有序序列；对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
        • 冒泡排序（Bubble Sort）嵌套循环，每次查看相邻的元素如果逆序，则交换。        
    
    高级排序 - O(N*LogN)  
        • 快速排序（Quick Sort）• 数组取标杆 pivot，将小元素放 pivot左边，大元素放右侧，然后依次对右边和右边的子数组继续快排；以达到整个序列有序。  
        • 归并排序（Merge Sort）— 分治
            1. 把长度为n的输入序列分成两个长度为n/2的子序列；
            2. 对这两个子序列分别采用归并排序；
            3. 将两个排序好的子序列合并成一个最终的排序序列
        • 堆排序（Heap Sort） — 堆插入 O(logN)，取最大/小值 O(1)
            1. 数组元素依次建立小顶堆
            2. 依次取堆顶元素，并删除
        
    特殊排序 - O(n)    
        • 计数排序（Counting Sort）
        计数排序要求输入的数据必须是有确定范围的整数。将输入的数据值转化为键存储在额外开辟的数组空间中；然后依次把计数大于 1 的填充回原数组
        • 桶排序（Bucket Sort）
        桶排序 (Bucket sort)的工作的原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排）。
        • 基数排序（Radix Sort）
        基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优先级排序。
     
    参考
        维基百科: https://zh.wikipedia.org/wiki/%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95
        百度百科: https://baike.baidu.com/item/%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95 
  

# 高级动态规划    
    高阶的 DP 问题   
        复杂度来源
        1. 状态拥有更多维度（二维、三维、或者更多、甚至需要压缩）
        2. 状态方程更加复杂
        本质：内功、逻辑思维、数学                         

        
# 字符串算法
    字符串基础知识
        字符串
        遍历字符串
        字符串比较
    
    高级字符串算法
        1. 暴力
        2. 中间湘两边扩张法
        3. 动态规划

    字符串匹配算法
        1. 暴力法
        2. Rabin-Karp算法
        3. KMP算法      