// Last updated: 9/25/2026, 2:39:11 PM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans=new StringBuilder("");
        ans.append(s.charAt(0));
        int f=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1) && f==2){
                continue;
            }
            else if(s.charAt(i)==s.charAt(i-1) && f==1){
                ans.append(s.charAt(i));
                f++;
            }
            else{
                ans.append(s.charAt(i));
                f=1;
            }
        }
        return ans.toString();
    }
}