package Week7.wordDictionary211;

/**
 * https://leetcode.cn/problems/design-add-and-search-words-data-structure/?envType=study-plan-v2&envId=top-interview-150
 */
public class WordDictionary {
    public WordDictionary[] node;
    public boolean isEnd;

    public WordDictionary() {
        node = new WordDictionary[26];
        isEnd = false;
    }

    public void addWord(String word) {
        WordDictionary cur = this;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (cur.node[index] == null) {
                cur.node[index] = new WordDictionary();
            }
            cur = cur.node[index];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        WordDictionary cur = this;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != '.') {
                int index = word.charAt(i) - 'a';
                if (cur != null && cur.node[index] != null) {
                    cur = cur.node[index];
                } else {
                    return false;
                }
            } else {
                for (int j = 0; j < 26; j++) {
                    boolean tmp;
                    if (cur != null && cur.node[j] != null) {
                        //怎么递归呢？好吧，得另外写一个方法？晚上再写吧
                        cur.search()
                    }
                }
            }

        }
        return cur.isEnd;
    }
}
