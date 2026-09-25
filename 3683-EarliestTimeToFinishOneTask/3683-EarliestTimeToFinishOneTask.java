// Last updated: 9/25/2026, 2:25:43 PM
class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            min=Math.min(min,tasks[i][0]+tasks[i][1]);
        }
        return min;
    }
}