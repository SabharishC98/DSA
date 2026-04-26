// Last updated: 4/26/2026, 11:45:04 PM
1class Solution {
2    public int countBattleships(char[][] board) {
3        int c=0;
4        for(int i=0;i<board.length;i++){
5            for(int j=0;j<board[0].length;j++){
6                if(i==0 && j==0){
7                    if(board[i][j]=='X') c++;
8                }
9                else if(i==0 && board[i][j]=='X' && board[i][j-1]!='X') c++;
10                else if(j==0 && board[i][j]=='X' && board[i-1][j]!='X') c++;
11                else if(i!=0 && j!=0 && board[i][j-1]!='X' && board[i][j]=='X' && board[i-1][j]!='X') c++;
12            }
13        }
14        return c;
15    }
16}