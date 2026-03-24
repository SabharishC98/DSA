// Last updated: 3/24/2026, 11:32:14 AM
class Solution {
    public int longestValidParentheses(String s) {
        int o=0,c=0,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') o++;
            else c++;
            if(c==o) max=Math.max(max,o*2);
            else if(c>o){
                o=0;
                c=0;
            }
        }
        c=0;
        o=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch==')')o++;
            else c++;
            if(c==o) max=Math.max(max,o*2);
            else if(c>o){
                o=0;
                c=0;
            }
        }
        return max;
    }
}