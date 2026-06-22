// Last updated: 6/22/2026, 9:20:17 AM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double minhand=6.0*minutes;
4        double hourhand=30.0*(hour%12)+0.5*minutes;
5        double diff=Math.abs(minhand-hourhand);
6        return Math.min(diff,360.0-diff);
7    }
8}