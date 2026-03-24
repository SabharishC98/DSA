// Last updated: 3/24/2026, 11:23:50 AM
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int max = 0;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1)
                    matrix[i][j] += matrix[i - 1][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            int[] hist = matrix[i].clone();
            Arrays.sort(hist);

            Stack<Integer> st = new Stack<>();
            for (int j = 0; j < cols; j++) {
                while (!st.isEmpty() && hist[st.peek()] > hist[j]) {
                    int h = hist[st.pop()];
                    int left = st.isEmpty() ? -1 : st.peek();
                    int width = j - left - 1;
                    max = Math.max(max, h * width);
                }
                st.push(j);
            }
            while (!st.isEmpty()) {
                int h = hist[st.pop()];
                int left = st.isEmpty() ? -1 : st.peek();
                int width = cols - left - 1;
                max = Math.max(max, h * width);
            }
        }

        return max;
    }
}