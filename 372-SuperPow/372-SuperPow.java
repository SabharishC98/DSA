// Last updated: 6/11/2026, 10:12:19 PM
1class Solution {
2    int MOD=1337;
3
4    public int superPow(int base,int[] b){
5        long result=1;
6        base%=MOD;
7        for(int digit:b){
8            result=powMod(result,10)*powMod(base,digit)%MOD;
9        }
10        return (int)result;
11    }
12
13    public long powMod(long base, int exp) {
14        long result=1;
15        base%=MOD;
16        while(exp>0){
17            if((exp & 1)==1) result=result*base%MOD;
18            base=base*base%MOD;
19            exp>>=1;
20        }
21        return result;
22    }
23}