// Last updated: 3/24/2026, 11:28:17 AM
class Solution {
    public boolean canConstruct(String r, String m) {
        int[] a1=new int[26];
        for(int i=0;i<r.length();i++){
            a1[r.charAt(i)-'a']++;
        }
        for(int i=0;i<m.length();i++){
            a1[m.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(a1[i]>0) return false;
        }
        return true;
    }
}