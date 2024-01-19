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
        return dfs(word, 0, this);
    }

    private boolean dfs(String word, int loc, WordDictionary cur) {
        //当前单词遍历完了，判断是否isEnd
        if (loc == word.length()) {
            return cur.isEnd;
        } else {
            if (word.charAt(loc) != '.') {
                int index = word.charAt(loc) - 'a';
                if (cur != null && cur.node[index] != null) {
                    return dfs(word, loc + 1, cur.node[index]);
                } else {
                    //遇到null直接false
                    return false;
                }
            } else {
                boolean tmp = false;
                for (int i = 0; i < 26; i++) {
                    if (cur != null && cur.node[i] != null) {
                        tmp = tmp || dfs(word, loc + 1, cur.node[i]);
                    }
                }
                return tmp;
            }
        }
    }
}
