// Last updated: 3/24/2026, 11:28:36 AM
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        
        // Create new array with 1s added to both ends
        int[] arr = new int[n + 2];
        arr[0] = arr[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }
        
        // dp[left][right] = max coins for (left, right)
        int[][] dp = new int[n + 2][n + 2];
        
        // length is the distance between left and right
        for (int len = 2; len < n + 2; len++) {
            for (int left = 0; left + len < n + 2; left++) {
                int right = left + len;
                for (int k = left + 1; k < right; k++) {
                    dp[left][right] = Math.max(
                        dp[left][right],
                        dp[left][k] + arr[left] * arr[k] * arr[right] + dp[k][right]
                    );
                }
            }
        }
        
        return dp[0][n + 1];
    }
}
