// Last updated: 3/24/2026, 11:22:42 AM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<words.length;i++){
            if(s.startsWith(words[i])) c++;
            // if(words[i].equals(s)) c++;
            // else if(words[i].length()>s.length()) continue;
            // else{
            //     int j=0;
            //     while(j<words[i].length()){
            //         if(s.charAt(j)!=words[i].charAt(j)) break;
            //         j++;
            //     }
            //     if(j==words[i].length()) c++;
            // }
        }
        return c;
    }
}