package topInterview150.week7.trie208;

/**
 * https://leetcode.cn/problems/implement-trie-prefix-tree/?envType=study-plan-v2&envId=top-interview-150
 */
public class Trie {
    public Trie[] node;
    public boolean isEnd;

    public Trie() {
        node = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie cur = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (cur.node[index] == null) {
                cur.node[index] = new Trie();
            }
            cur = cur.node[index];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        Trie cur = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (cur != null && cur.node[index] != null) {
                cur = cur.node[index];
            } else {
                return false;
            }
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie cur = this;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (cur != null && cur.node[index] != null) {
                cur = cur.node[index];
            } else {
                return false;
            }
        }
        return true;
    }
}

//["Trie","startsWith"]
//[[],["a"]]

//注意 Trie cur = this;的操作，不然拿不到第一层
//第一个节点是空的，类似头指针，导致能搜索到最后一定是非空的节点，一旦搜索到空节点必定是false