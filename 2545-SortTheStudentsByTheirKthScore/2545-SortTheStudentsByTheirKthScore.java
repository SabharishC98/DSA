// Last updated: 9/25/2026, 2:30:10 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score,(b,a)->a[k]-b[k]);
        return score;

    }
}