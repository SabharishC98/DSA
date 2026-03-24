// Last updated: 3/24/2026, 11:22:11 AM
class Solution {
    public int maximumValue(String[] strs) {
        int c=Integer.MIN_VALUE;
        for(String s : strs){
            boolean alpha=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)>=97 && s.charAt(j)<=122){
                    alpha=true;
                    break;
                }
            }
            if(alpha){
                c=Math.max(c,s.length());
            }
            else{
                c=Math.max(c,Integer.valueOf(s));
            }
        }
        return c;
    }
}

