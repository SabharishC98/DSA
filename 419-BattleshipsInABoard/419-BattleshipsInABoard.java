// Last updated: 9/25/2026, 2:47:51 PM
class Solution {
    public int countBattleships(char[][] board) {
        int c=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 && j==0){
                    if(board[i][j]=='X') c++;
                }
                else if(i==0 && board[i][j]=='X' && board[i][j-1]!='X') c++;
                else if(j==0 && board[i][j]=='X' && board[i-1][j]!='X') c++;
                else if(i!=0 && j!=0 && board[i][j-1]!='X' && board[i][j]=='X' && board[i-1][j]!='X') c++;
            }
        }
        return c;
    }
}