// Last updated: 9/25/2026, 2:26:33 PM
class Solution {
    public boolean isBalanced(String num) {
        int o=0,e=0;
        for(int i=0;i<num.length();i+=2){
            o+=num.charAt(i)-48;
        }
        for(int i=1;i<num.length();i+=2){
            e+=num.charAt(i)-48;
        }
        return o==e;
    }
}