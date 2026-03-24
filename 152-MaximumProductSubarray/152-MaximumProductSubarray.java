// Last updated: 3/24/2026, 11:30:03 AM
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minSoFar = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            
            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);
            
            maxProduct = Math.max(maxProduct, maxSoFar);
        }
        
        return maxProduct;
    }
}
