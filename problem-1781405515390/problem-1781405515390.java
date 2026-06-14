// Last updated: 6/14/2026, 8:21:55 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        long sum=0,d=0;
4        while(n>0){
5            int r=n%10;
6            sum+=r;
7            d+=r*r;
8            n/=10;
9        }
10        return d-sum>=50;
11    }
12}