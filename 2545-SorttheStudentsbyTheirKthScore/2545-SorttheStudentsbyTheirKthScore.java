// Last updated: 7/23/2026, 11:52:00 AM
1class Solution {
2    public int[][] sortTheStudents(int[][] score, int k) {
3        Arrays.sort(score,(b,a)->a[k]-b[k]);
4        return score;
5
6    }
7}