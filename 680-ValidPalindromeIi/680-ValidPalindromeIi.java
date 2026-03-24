// Last updated: 3/24/2026, 11:26:47 AM
class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return pal(s,i,j-1) || pal(s,i+1,j);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean pal(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}