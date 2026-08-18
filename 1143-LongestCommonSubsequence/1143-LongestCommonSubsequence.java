// Last updated: 8/19/2026, 1:38:21 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int[][] memo=new int[text1.length()][text2.length()];
4        for(int[] i:memo){
5            Arrays.fill(i,-1);
6        }
7        return process(text1,text2,0,0,memo);
8    }
9    public int process(String s,String p,int i,int j,int[][] memo){
10        if(i==s.length() || j==p.length()){
11            return 0;
12        }
13        if(memo[i][j]!=-1){
14            return memo[i][j];
15        }
16        if(s.charAt(i)==p.charAt(j)){
17            return memo[i][j]=1+process(s,p,i+1,j+1,memo);
18        }
19        return memo[i][j]=Math.max(process(s,p,i+1,j,memo),process(s,p,i,j+1,memo));
20    }
21}