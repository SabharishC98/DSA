// Last updated: 7/26/2026, 11:11:18 PM
1class Solution {
2    public long maxProduct(int[] nums) {
3        long f=0,s=0;
4        for(int i:nums){
5            if(Math.abs(i)>f){
6                s=f;
7                f=Math.abs(i);
8            }
9            else if(Math.abs(i)>s){
10                s=Math.abs(i);
11            }
12        }
13        return f*s*100000;
14    }
15}