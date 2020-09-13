package shuati;


/**
 * 208. 实现 Trie (前缀树)
 * 题目描述:
 *      实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 *      示例:
 *          Trie trie = new Trie();
 *          trie.insert("apple");
 *          trie.search("apple");   // 返回 true
 *          trie.search("app");     // 返回 false
 *          trie.startsWith("app"); // 返回 true
 *          trie.insert("app");
 *          trie.search("app");     // 返回 true
 *
 * 题解:
 *      官方: https://leetcode-cn.com/problems/implement-trie-prefix-tree/solution/shi-xian-trie-qian-zhui-shu-by-leetcode/
 *
 *
 * 理解程度(不理解\理解\掌握\熟练\精通):
 *       不理解, 抄了1遍
 */
public class ImplementTriePrefixTree {


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");   // 返回 true
        System.out.println(trie.search("apple"));
        trie.search("app");     // 返回 false
        System.out.println(trie.search("app"));
        trie.startsWith("app");       // 返回 true
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        trie.search("app");     // 返回 true
        System.out.println(trie.search("app"));
    }
}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    /**
     * 复杂度分析
     * 时间复杂度：O(m)，其中 m 为键长。在算法的每次迭代中，我们要么检查要么创建一个节点，直到到达键尾。只需要 m 次操作。
     * 空间复杂度：O(m)。最坏的情况下，新插入的键和 Trie 树中已有的键没有公共前缀。此时需要添加 m 个结点，使用 O(m) 空间。
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TrieNode());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }

    /**
     * 时间复杂度 : O(m)。算法的每一步均搜索下一个键字符。最坏的情况下需要 mm 次操作。
     * 空间复杂度 : O(1)。
     */
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    /**
     * 时间复杂度 : O(m)。算法的每一步均搜索下一个键字符。最坏的情况下需要 mm 次操作。
     * 空间复杂度 : O(1)。
     */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }


    /**
     * 复杂度分析
     *     时间复杂度 : O(m)。
     *     空间复杂度 : O(1)。
     */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }
}

class TrieNode {

    // R links to node children
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return links[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}