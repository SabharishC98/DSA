// Last updated: 8/16/2026, 1:15:52 AM
1class Solution {
2    Boolean[][] memo;
3    public boolean isMatch(String s, String p) {
4        memo=new Boolean[s.length()+1][p.length()+1];
5        return process(s,p,0,0,memo);
6    }
7    public boolean process(String s,String p,int i,int j,Boolean[][] memo){
8        if(memo[i][j]!=null) return memo[i][j];
9        if(j==p.length()){
10            return i==s.length();
11        }
12        if(i==s.length()){
13            for(int k=j;k<p.length();k++){
14                if(p.charAt(k)!='*') return false;
15            }
16            return true;
17        }
18        if(p.charAt(j)=='*'){
19            return memo[i][j]=process(s,p,i,j+1,memo) || (process(s,p,i+1,j,memo));
20        }
21        else if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
22            return memo[i][j]=process(s,p,i+1,j+1,memo);
23        }
24        else{
25            return memo[i][j]=false;
26        }
27    }
28}