// Last updated: 6/16/2026, 9:03:41 AM
1class Solution {
2    public String processStr(String s) {
3        StringBuilder sb=new StringBuilder("");
4        for(char ch:s.toCharArray()){
5            if(ch=='*'){
6                if(sb.length()>0) sb.deleteCharAt(sb.length()-1);
7            }
8            else if(ch=='#') sb.append(sb);
9            else if(ch=='%') sb.reverse();
10            else sb.append(ch);
11        }
12        return sb.toString();
13    }
14}