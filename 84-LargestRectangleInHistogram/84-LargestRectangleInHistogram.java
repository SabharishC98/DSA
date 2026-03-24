// Last updated: 3/24/2026, 11:31:14 AM
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                int h = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int h = heights[stack.pop()];
            int left = stack.isEmpty() ? -1 : stack.peek();
            int width = n - left - 1;
            maxArea = Math.max(maxArea, h * width);
        }

        return maxArea;
    }
}
