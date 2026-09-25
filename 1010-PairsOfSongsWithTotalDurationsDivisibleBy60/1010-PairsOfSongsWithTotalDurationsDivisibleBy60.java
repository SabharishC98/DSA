// Last updated: 9/25/2026, 2:40:50 PM
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long[] count=new long[60];
        for(int i:time){
            count[i%60]++;
        }
        long ans = 0;
        ans += count[0] * (count[0] - 1) / 2;
        ans += count[30] * (count[30] - 1) / 2;
        for (int r = 1; r < 30; r++) {
            ans += (count[r] * count[60 - r]);
        }

        return (int)(ans);
    }
}