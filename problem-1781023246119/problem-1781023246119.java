// Last updated: 6/9/2026, 10:10:46 PM
1class Solution {
2    public String countAndSay(int n) {
3        String s="1";
4        if(n==1) return s;
5        for(int i=1;i<n;i++){
6            s=helper(s);
7        }
8        return s;
9    }
10    public String helper(String s){
11        StringBuilder ans=new StringBuilder();
12        int count=1;
13        for(int i=1;i<s.length();i++){
14            if(s.charAt(i)!=s.charAt(i-1)){
15                ans.append(count+""+s.charAt(i-1));
16                count=1;
17            }
18            else count++;
19        }
20        ans.append(count+""+s.charAt(s.length()-1));
21        return ans.toString();
22    }
23}