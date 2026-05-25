// Last updated: 5/26/2026, 1:54:43 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] arr=s.split(" ");
4        String ans="";
5        for(String i:arr){
6            if(i.length()!=0){
7                if(ans.equals("")) ans=i;
8                else ans=i+" "+ans;
9            }
10        }
11        return ans;
12    }
13}