// Last updated: 3/24/2026, 11:26:33 AM
class Solution {
    public int cherryPickup(int[][] grid) {
         int n = grid.length;
      
        // dp[step][row1][row2] represents the maximum cherries collected
        // when person 1 is at (row1, col1) and person 2 is at (row2, col2)
        // where col1 = step - row1 and col2 = step - row2
        int[][][] dp = new int[n * 2][n][n];
      
        // Initialize starting position
        dp[0][0][0] = grid[0][0];
      
        // Iterate through all possible steps (Manhattan distance from origin)
        for (int step = 1; step < n * 2 - 1; step++) {
            // Try all possible positions for person 1
            for (int row1 = 0; row1 < n; row1++) {
                // Try all possible positions for person 2
                for (int row2 = 0; row2 < n; row2++) {
                    // Calculate column positions based on current step
                    int col1 = step - row1;
                    int col2 = step - row2;
                  
                    // Initialize current state as invalid
                    dp[step][row1][row2] = Integer.MIN_VALUE;
                  
                    // Check if positions are valid (within bounds and not thorns)
                    if (col1 < 0 || col1 >= n || col2 < 0 || col2 >= n || 
                        grid[row1][col1] == -1 || grid[row2][col2] == -1) {
                        continue;
                    }
                  
                    // Calculate cherries collected at current positions
                    int currentCherries = grid[row1][col1];
                    // Avoid double counting if both persons are at the same cell
                    if (row1 != row2) {
                        currentCherries += grid[row2][col2];
                    }
                  
                    // Check all possible previous positions for person 1
                    // Person 1 could have come from (row1-1, col1) or (row1, col1-1)
                    for (int prevRow1 = row1 - 1; prevRow1 <= row1; prevRow1++) {
                        // Check all possible previous positions for person 2
                        // Person 2 could have come from (row2-1, col2) or (row2, col2-1)
                        for (int prevRow2 = row2 - 1; prevRow2 <= row2; prevRow2++) {
                            // Ensure previous positions are within bounds
                            if (prevRow1 >= 0 && prevRow2 >= 0) {
                                dp[step][row1][row2] = Math.max(
                                    dp[step][row1][row2], 
                                    dp[step - 1][prevRow1][prevRow2] + currentCherries
                                );
                            }
                        }
                    }
                }
            }
        }
      
        // Return the maximum cherries collected when both persons reach (n-1, n-1)
        // Return 0 if no valid path exists
        return Math.max(0, dp[n * 2 - 2][n - 1][n - 1]);
    }
}