# 学习心得
    五毒神掌太难练了,希望自己能掌握
    13期-刷题狂魔组 第三周(周一~周五)算法题 完成了1遍, 但是本周课程课后练习还没开始.
    补充了 第3周的 学习心得与笔记: https://github.com/a4471174/algorithm013/blob/master/Week_03/README.md
    希望后面自己可以跟上节奏.



# 学习笔记

# 第4周 第9课 | 深度优先搜索和广度优先搜索

##   1. 深度优先搜索、广度优先搜索的实现和特性
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
            
##   2. 实战题目解析：二叉树的层次遍历等问题
    
    

# 第4周 第10课 | 贪心算法

##   贪心的实现、特性及实战题目解析
    贪心算法
        • 贪心算法（英语：greedy algorithm），又称贪婪算法，是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致结果是最好或最优的算法。。
        • 贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。
        参考：
            维基百科:
                https://zh.wikipedia.org/wiki/%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95
            百度百科:
                https://baike.baidu.com/item/%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95

# 第4周 第11课 | 二分查找

##   二分查找的实现、特性及实战题目解析
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


# 13期-刷题狂魔组 算法题
    Week04
    【day22】 全排列				    https://leetcode-cn.com/problems/permutations/								    @UNDERWAY  2 time
                                    https://github.com/a4471174/algorithm013/blob/master/Week_04/shuati.Permutations.java
                                    
    【day23】 爬楼梯				    https://leetcode-cn.com/problems/climbing-stairs/								@UNDERWAY  3 time
                                    https://github.com/a4471174/algorithm013/blob/master/Week_04/shuati.ClimbStairs2.java
                                    
    【day24】 买卖股票的最佳时机 II	https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/			@UNDERWAY  2 time
                                    https://github.com/a4471174/algorithm013/blob/master/Week_04/shuati.MaxProfit.java
                                    
    【day25】 柠檬水找零			    https://leetcode-cn.com/problems/lemonade-change/description/					@UNDERWAY  2 time
                                    https://github.com/a4471174/algorithm013/blob/master/Week_04/shuati.LemonadeChange.java
                                    
    【day26】 岛屿数量		        https://leetcode-cn.com/problems/number-of-islands/								@UNDERWAY  2 time
                                    https://github.com/a4471174/algorithm013/blob/master/Week_04/shuati.NumIslands.java