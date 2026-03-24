// Last updated: 3/24/2026, 11:31:49 AM
class Solution {
    List<List<String>> res=new ArrayList<>();
    char board[][];
    Set<Integer> col=new HashSet<>();
    Set<Integer> pd=new HashSet<>();
    Set<Integer> nd=new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        back(0,n);
        return res;
    }
    public void back(int r,int n){
        if(r==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            res.add(l);
            return;
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
}