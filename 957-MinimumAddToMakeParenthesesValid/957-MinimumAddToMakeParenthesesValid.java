// Last updated: 3/24/2026, 11:25:46 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int o=0,c=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') o++;
            else c++;
            if(c>o){
                count++;
                o++;
            }
        }
        if(c!=o){
            count+=(o-c);
        }
        return count;
    }
}