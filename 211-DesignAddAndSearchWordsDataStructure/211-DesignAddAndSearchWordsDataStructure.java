// Last updated: 3/24/2026, 11:29:26 AM
class TrieNode {
    TrieNode[] sub;
    boolean isEnd;

    TrieNode() {
        sub = new TrieNode[26];
        isEnd = false;
    }
}

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for (char ch : word.toCharArray()) {
            if (cur.sub[ch - 'a'] == null) {
                cur.sub[ch - 'a'] = new TrieNode();
            }
            cur = cur.sub[ch - 'a'];
        }
        cur.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node) {
        if (node == null) return false;

        if (index == word.length()) {
            return node.isEnd;
        }

        char ch = word.charAt(index);

        if (ch == '.') {
            for (int i = 0; i < 26; i++) {
                if (node.sub[i] != null) {
                    if (dfs(word, index + 1, node.sub[i])) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return dfs(word, index + 1, node.sub[ch - 'a']);
        }
    }
}
