// Last updated: 9/25/2026, 2:27:22 PM
class Solution {
    public long countCompleteDayPairs(int[] time) {
        long[] count=new long[24];
        for(int i:time){
            count[i%24]++;
        }
        long ans = 0;
        ans += count[0] * (count[0] - 1) / 2;
        ans += count[12] * (count[12] - 1) / 2;
        for (int r = 1; r < 12; r++) {
            ans += (count[r] * count[24 - r]);
        }

        return (ans );
    }
}