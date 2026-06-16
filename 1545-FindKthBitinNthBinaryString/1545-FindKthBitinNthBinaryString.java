// Last updated: 6/16/2026, 10:19:25 AM
1class Solution {
2    public char findKthBit(int n, int k) {
3        StringBuilder sb=new StringBuilder("0");
4        for(int i=1;i<n;i++){
5            StringBuilder temp=new StringBuilder("");
6            for(int j=0;j<sb.length();j++){
7                temp.append(sb.charAt(j)=='0'?'1':'0');
8            }
9            temp.reverse();
10            sb.append('1');
11            sb.append(temp);
12        }
13        // System.out.println(sb);
14        return sb.charAt(k-1);
15    }
16}