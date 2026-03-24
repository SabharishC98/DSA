// Last updated: 3/24/2026, 11:23:59 AM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans[]=new int[26];
        for(int i=0;i<allowed.length();i++){
            ans[allowed.charAt(i)-97]++;
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            int f=0;
            for(int j=0;j<words[i].length();j++){
                if(ans[words[i].charAt(j)-97]==0) f=1;
            }
            if(f==0) c++;
        }
        return c;
    }
}