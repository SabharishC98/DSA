// Last updated: 3/24/2026, 11:31:20 AM
class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean[][] visited = new boolean[rows][cols];
                    if (dfs(board, word, 0, visited, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, boolean[][] visited, int i, int j) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
            visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }

        visited[i][j] = true;

        boolean found =
            dfs(board, word, index + 1, visited, i - 1, j) ||
            dfs(board, word, index + 1, visited, i + 1, j) ||
            dfs(board, word, index + 1, visited, i, j - 1) ||
            dfs(board, word, index + 1, visited, i, j + 1);

        visited[i][j] = false;
        return found;
    }
}
