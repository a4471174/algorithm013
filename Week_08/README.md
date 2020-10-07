# 学习心得
           
    对于本周的（位运算\布隆过滤器\LRU缓存\排序算法）的内容掌握的不是很好,审题、解题 、编码等都有问题， 需要多巩固练习。
    
    13期-刷题狂魔组 第8周(周一~周日)算法题 完成了1遍, 但课后练习还没开始.
    LeetCode每日一题 刷了一遍, 有些弄懂了, 有些没弄懂.


    多多做题，整理笔记。
    
    希望后面自己可以跟上节奏, 

   


# 学习笔记    

# 第8周 第16课 | 位运算

##   1. 位运算基础及实战要点
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
    
##   2. 位运算实战题目解析
    @todo


# 第8周 第17课 | 布隆过滤器和LRU缓存

##   1. 布隆过滤器的实现及应用
    布隆过滤器
        • 实际上是一个很长的二进制向量和一系列随机映射函数。
        • 布隆过滤器可以用于检索一个元素是否在一个集合中。
        • 优点是空间效率和查询时间都远远超过一般的算法，缺点是有一定的误识别率和删除困难。
        参考
            维基百科: https://zh.wikipedia.org/wiki/%E5%B8%83%E9%9A%86%E8%BF%87%E6%BB%A4%E5%99%A8
            百度百科: https://baike.baidu.com/item/%E5%B8%83%E9%9A%86%E8%BF%87%E6%BB%A4%E5%99%A8

##   2. LRU Cache的实现、应用和题解
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
            
# 第8周 第18课 | 排序算法

##   1. 初级排序和高级排序的实现和特性
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
        
##   2. 特殊排序及实战题目详解
    @todo
​    
# 13期-刷题狂魔组 算法题


| 天数  | 题目                | 链接                                                                                                       | 次数 |
| ----- | ------------------ | ---------------------------------------------------------------------------------------------------------- | ---- |
| day50 | 朋友圈              | https://leetcode-cn.com/problems/friend-circles/                                                           | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/FriendCircles.java                     |      |
| day51 | 有效的完全平方数     | https://leetcode-cn.com/problems/valid-perfect-square/                                                     | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/ValidPerfectSquare.java                |      |
| day52 | 打家劫舍            | https://leetcode-cn.com/problems/house-robber/                                                             | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/HouseRobber.java                       |      |
| day53 | 颠倒二进制位         | https://leetcode-cn.com/problems/reverse-bits/                                                             | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/ReverseBits.java                       |      |
| day54 | 两两交换链表中的节点  | https://leetcode-cn.com/problems/swap-nodes-in-pairs/                                                      | 2    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/SwapNodesInPairs.java                  |      |
| day56 | 最长重复子数组       | https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/                                      | 1    |
|       |                    | https://github.com/a4471174/algorithm013/blob/master/Week_08/shuati/MaximumLengthOfRepeatedSubarray.java   |      |
|       |                    |                                                                                                            |      |

​                                         