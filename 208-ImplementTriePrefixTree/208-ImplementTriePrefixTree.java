// Last updated: 3/24/2026, 11:29:28 AM
class TrieNode{
    TrieNode[] sub;
    boolean isEnd;
    TrieNode(){
        sub=new TrieNode[26];
        isEnd=false;
    }
}

class Trie {
    TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.sub[ch-'a']!=null){
                cur=cur.sub[ch-'a'];
            }
            else{
                cur.sub[ch-'a']=new TrieNode();
                cur=cur.sub[ch-'a'];
            }
            
            if(i==word.length()-1){
                cur.isEnd=true;
            }
        }
    }
    
    public boolean search(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.sub[ch-'a']==null){
                return false;
            }
            else{
                cur=cur.sub[ch-'a'];
            }
            if(i==word.length()-1 && cur.isEnd) return true;
        }
        return false;
    }
    
    public boolean startsWith(String word) {
        TrieNode cur=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(cur.sub[ch-'a']==null){
                return false;
            }
            else{
                cur=cur.sub[ch-'a'];
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */