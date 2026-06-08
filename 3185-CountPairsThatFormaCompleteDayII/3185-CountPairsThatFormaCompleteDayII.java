// Last updated: 6/9/2026, 12:00:40 AM
1class Solution {
2    public long countCompleteDayPairs(int[] time) {
3        long[] count=new long[24];
4        for(int i:time){
5            count[i%24]++;
6        }
7        long ans = 0;
8        ans += count[0] * (count[0] - 1) / 2;
9        ans += count[12] * (count[12] - 1) / 2;
10        for (int r = 1; r < 12; r++) {
11            ans += (count[r] * count[24 - r]);
12        }
13
14        return (ans );
15    }
16}