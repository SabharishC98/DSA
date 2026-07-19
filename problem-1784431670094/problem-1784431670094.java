// Last updated: 7/19/2026, 8:57:50 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        return ((start[0]+start[1])&1)==((target[0]+target[1])&1);
4    }
5}