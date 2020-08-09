# 学习心得

    13期-刷题狂魔组 算法题 完成了一遍, 但是本周课程课后练习还没开始.
    希望后面自己可以跟上节奏.



# 学习笔记

# 预习 如何高效学习

##   数据结构与算法总览
    
    三分看视频理解、七分理解
    • 视频： 1.5~2.0倍数播放、难点（暂停+反复）
    
    摒弃“旧”习惯
    • 五毒神掌、看高手代码
    • 5分钟想不出来,看题解,用五毒神掌。 

          
# 预习 第1课 | 数据结构与算法总览

##   数据结构与算法总览

    精通一个领域
    • 知识分解\连接
    • 刻意练习(五毒神掌)
    • 反馈(即时\主动型\被动型反馈)
    
    刷题技巧 
    • 澄清\思考可能性解\编码\测试
    
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


# 预习 第2课 | 训练准备和复杂度分析

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


# 第1周 第3课 | 数组、链表、跳表

##   1. 数组、链表、跳表的基本实现和特性
    Array
        数组（英语：Array），是由相同类型的元素（element）的集合所组成的数据结构，分配一块连续的内存来存储。
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
        链表由一系列结点（链表中每一个元素称为结点）组成，结点可以在运行时动态生成。
        链表是一种物理存储单元上非连续、非顺序的存储结构，元素的逻辑顺序是通过链表中的指针链接次序实现的。
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
            Java
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
         在计算机科学中，跳跃列表是一种数据结构。它使得包含n个元素的有序序列的查找和插入操作的平均时间复杂度都是O(log n)，优于数组的O(n)复杂度。
         复杂度：
            时间复杂度：
                O(log n)
            空间复杂度：
                O(n)
         程序实现:  
             Java
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
         工程中的应用：
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
        
##   2. 实战题目解析：移动零

##   3. 实战题目解析：盛水最多的容器、爬楼梯

##   4. 实战题目解析：3数之和、环形链表



# 第1周 第4课 | 栈、队列、优先队列、双端队列

##   1. 栈和队列的实现与特性
    Stack    
        堆栈（英语：stack）又称为栈或堆叠，是计算机科学中的一种抽象数据类型，只允许在有序的线性数据集合的一端（称为堆栈顶端，英语：top）进行加入数据（英语：push）和移除数据（英语：pop）的运算。因而按照后进先出（LIFO, Last In First Out）的原理运作。       
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
        队列，又称为伫列（queue），计算机科学中的一种抽象资料型别，是先进先出（FIFO, First-In-First-Out）的线性表。在具体应用中通常用链表或者数组来实现。队列只允许在后端（称为rear）进行插入操作，在前端（称为front）进行删除操作。
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

            
##   2. 实战题目解析：有效的括号、最小栈等问题

##   实战题目 - Array
    1. https://leetcode-cn.com/problems/container-with-most-water/              @TODO
    2. https://leetcode-cn.com/problems/move-zeroes/                            @TODO
    3. https://leetcode-cn.com/problems/climbing-stairs/                        @UNDERWAY  1 time
    4. https://leetcode-cn.com/problems/3sum/ (高频老题）                        @TODO
##   实战练习题目 - Linked List
    1. https://leetcode-cn.com/problems/reverse-linked-list/                    @TODO
    2. https://leetcode-cn.com/problems/swap-nodes-in-pairs                     @UNDERWAY  1 time
    3. https://leetcode-cn.com/problems/linked-list-cycle                       @TODO
    4. https://leetcode-cn.com/problems/linked-list-cycle-ii                    @TODO
    5. https://leetcode-cn.com/problems/reverse-nodes-in-k-group/               @TODO    
##   homework
    1. https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/    @TODO
    2. https://leetcode-cn.com/problems/rotate-array/                           @TODO
    3. https://leetcode-cn.com/problems/merge-two-sorted-lists/                 @UNDERWAY  1 time
    4. https://leetcode-cn.com/problems/merge-sorted-array/                     @TODO
    5. https://leetcode-cn.com/problems/two-sum/                                @UNDERWAY  1 time
    6. https://leetcode-cn.com/problems/move-zeroes/                            @TODO
    7. https://leetcode-cn.com/problems/plus-one/                               @UNDERWAY  1 time   
##   实战题目
    1. https://leetcode-cn.com/problems/largest-rectangle-in-histogram          @TODO
    2. https://leetcode-cn.com/problems/sliding-window-maximum                  @TODO
##   homework    
    1. https://leetcode.com/problems/design-circular-deque                      @UNDERWAY  1 time
    2. https://leetcode.com/problems/trapping-rain-water/                       @TODO
  
  
# 13期-刷题狂魔组 算法题
    Week01
    【day1】  爬楼梯 https://github.com/a4471174/algorithm013/blob/master/Week_01/ClimbStairs.java
    【day2】  加一   https://github.com/a4471174/algorithm013/blob/master/Week_01/PlusOne.java
    【day3】  两数之和 https://github.com/a4471174/algorithm013/blob/master/Week_01/TwoSum.java
    【day4】  两两交换链表中的节点 https://github.com/a4471174/algorithm013/blob/master/Week_01/SwapPairs.java
    【day5】  合并两个有序链表 https://github.com/a4471174/algorithm013/blob/master/Week_01/MergeTwoLists.java
    【day6】  猜数字游戏 https://github.com/a4471174/algorithm013/blob/master/Week_01/GetHint.java   
    【day7】  设计循环双端队列 https://github.com/a4471174/algorithm013/blob/master/Week_01/MyCircularDeque.java


