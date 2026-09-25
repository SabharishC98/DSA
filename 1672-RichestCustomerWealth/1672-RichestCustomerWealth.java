// Last updated: 9/25/2026, 2:36:00 PM
class Solution {
    public int maximumWealth(int[][] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}