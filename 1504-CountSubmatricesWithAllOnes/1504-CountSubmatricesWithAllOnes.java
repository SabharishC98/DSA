// Last updated: 9/25/2026, 2:36:49 PM
class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int[][] nums=new int[n][m];
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) nums[i][j] = 0;
                else nums[i][j] = (j > 0 ? nums[i][j-1] : 0) + 1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int min=nums[i][j];
                ans+=min;
                for(int k=i-1;k>=0;k--){
                    min=Math.min(nums[k][j],min);
                    if(min==0) break;
                    ans+=min;
                }
                
            }
        }
        return ans;
    }
}