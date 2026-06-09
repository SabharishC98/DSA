// Last updated: 6/9/2026, 11:29:19 AM
1class Solution {
2    public int countNumbersWithUniqueDigits(int n) {
3        if(n==0) return 1;
4        if(n==1) return 10;
5        int ans=9;
6        for(int i=9;i>=11-n;i--){
7            ans*=i;
8        }
9        return ans+countNumbersWithUniqueDigits(n-1);
10    }
11}