// Last updated: 3/24/2026, 11:32:07 AM
class Solution {
    Map<Integer,List<Character>> col=new HashMap<>();
    Map<Integer,List<Character>> row=new HashMap<>();
    Map<Integer,List<Character>> box=new HashMap<>();
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.' && !isValid(board,i,j,board[i][j])) return false;
                  
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int r, int c, char ch) {
        for (int i = 0; i < 9; i++) {
            if (i!=c && board[r][i] == ch) return false;          // row
            if (i!=r && board[i][c] == ch) return false;          // col
            int br = 3*(r/3) + i/3;
            int bc = 3*(c/3) + i%3;
            if ((br!=r || bc!=c) && board[br][bc] == ch) return false;        // 3×3 box
        }
        return true;
    }
}