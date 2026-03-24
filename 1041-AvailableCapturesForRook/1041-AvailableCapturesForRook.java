// Last updated: 3/24/2026, 11:25:26 AM
class Solution {
    public int numRookCaptures(char[][] board) {
        int index1=0,index2=0,count=0;
        for(int i=0;i<board.length;i++){
            int f=0;
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='R'){
                    f=1;
                    index1=i;
                    index2=j;
                    break;
                }
            }
            if(f==1) break;
        }
        int l=index2-1,r=index2+1;
        while(l>=0){
            if(board[index1][l]!='p' && board[index1][l]!='.')
            break;
            else if(board[index1][l]=='p'){
                count++;
                break;
            }
            l--;
        }
        while(r<8){
            if(board[index1][r]!='p' && board[index1][r]!='.')
            break;
            else if(board[index1][r]=='p'){
                count++;
                break;
            }
            r++;
        }
        l=index1-1;
        r=index1+1;
        while(l>=0){
            if(board[l][index2]!='p' && board[l][index2]!='.')
            break;
            else if(board[l][index2]=='p'){
                count++;
                break;
            }
            l--;
        }
        while(r<8){
            if(board[r][index2]!='p' && board[r][index2]!='.')
            break;
            else if(board[r][index2]=='p'){
                count++;
                break;
            }
            r++;
        }
        return count;
    }
}