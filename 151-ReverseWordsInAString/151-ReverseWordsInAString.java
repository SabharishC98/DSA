// Last updated: 9/25/2026, 2:51:50 PM
class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ans="";
        for(String i:arr){
            if(i.length()!=0){
                if(ans.equals("")) ans=i;
                else ans=i+" "+ans;
            }
        }
        return ans;
    }
}