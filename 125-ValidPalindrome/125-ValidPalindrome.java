// Last updated: 3/24/2026, 11:30:29 AM
class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        int i=0,j=str.length()-1;
        while(i<j){
            if((str.charAt(i)<'a' || str.charAt(i)>'z') && (str.charAt(i)>'9' || str.charAt(i)<'0')){
                i++;
                continue;
            }
            if((str.charAt(j)<'a' || str.charAt(j)>'z') && (str.charAt(j)>'9' || str.charAt(j)<'0')){
                j--;
                continue;
            }
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}