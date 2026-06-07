// Last updated: 6/7/2026, 8:09:13 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int st=Math.max(1,n-k), end=n+k,c=0;
4        for(int i=st;i<=end;i++){
5            if(Math.abs(n-i)<=k && ((n&i)==0)) c+=i;
6        }
7        return c;
8    }
9}