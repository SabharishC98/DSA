// Last updated: 3/24/2026, 11:26:03 AM
class Solution {
    public int binaryGap(int n) {
        int last = -1;  
        int max = 0;
        int index = 0;  

        while (n > 0) {
            if ((n & 1) == 1) { 
                if (last != -1) {
                    max = Math.max(max, index - last);
                }
                last = index;
            }
            index++;
            n >>= 1; 
        }

        return max;
    }
}
