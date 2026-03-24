// Last updated: 3/24/2026, 11:31:48 AM
class Solution {int c=0;
    char board[][];
    Set<Integer> col=new HashSet<>();
    Set<Integer> pd=new HashSet<>();
    Set<Integer> nd=new HashSet<>();
    
    public void back(int r,int n){
        if(r==n){
            c++;
        }
        for(int j=0;j<n;j++){
            if(!col.contains(j) && !pd.contains(r+j) && !nd.contains(r-j)){
                board[r][j]='Q';
                col.add(j);
                pd.add(r+j);
                nd.add(r-j);
                back(r+1,n);
                board[r][j]='.';
                col.remove(j);
                pd.remove(r+j);
                nd.remove(r-j);
            }
        }
    }
    public int totalNQueens(int n) {
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        back(0,n);
        return c;
    }
}