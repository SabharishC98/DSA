// Last updated: 3/24/2026, 11:21:00 AM
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