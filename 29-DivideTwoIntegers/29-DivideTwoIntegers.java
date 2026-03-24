// Last updated: 3/24/2026, 11:32:17 AM
class Solution {
    public int divide(int dividend, int divisor) {
     if(dividend<=Integer.MIN_VALUE && divisor==-1)
         return   Integer.MAX_VALUE;
         return dividend/divisor;
    }
}