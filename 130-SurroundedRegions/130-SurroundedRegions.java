// Last updated: 3/24/2026, 11:30:24 AM
class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if((i==0 || j==0 || i==board.length-1 || j==board[0].length-1) && board[i][j]=='O'){
                    bfs(board,i,j,'s');
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    bfs(board,i,j,'X');
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='s') board[i][j]='O';
            }
        }
    }
    public void bfs(char[][] board,int i,int j,char ch){
        board[i][j]=ch;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] d:dir){
            int r=d[0]+i;
            int c=d[1]+j;
            if(r>=0 && r<board.length && c>=0 && c<board[0].length && board[r][c]=='O') bfs(board,r,c,ch);
        }
    }
}