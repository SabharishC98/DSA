// Last updated: 3/24/2026, 11:32:06 AM
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') continue;

                for (char ch = '1'; ch <= '9'; ch++) {
                    if (isValid(board, r, c, ch)) {
                        board[r][c] = ch;
                        if (solve(board)) return true;
                        board[r][c] = '.';  // backtrack
                    }
                }
                return false;  // no digit worked → trigger backtrack
            }
        }
        return true;  // no empty cell found → solved
    }

    public boolean isValid(char[][] board, int r, int c, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == ch) return false;          // row
            if (board[i][c] == ch) return false;          // col
            int br = 3*(r/3) + i/3;
            int bc = 3*(c/3) + i%3;
            if (board[br][bc] == ch) return false;        // 3×3 box
        }
        return true;
    }
}