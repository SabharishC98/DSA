// Last updated: 3/24/2026, 11:24:37 AM
class Solution {
    public String freqAlphabets(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i<=s.length()-3 && s.charAt(i+2)=='#'){
                ans+=String.valueOf((char)((s.charAt(i)-48)*10+(s.charAt(i+1)-48)+96));
                i+=2;
            }
            else{
                ans+=String.valueOf((char)(s.charAt(i)-48+96));
            }
        }
        return ans;
    }
}