// Last updated: 4/27/2026, 12:06:03 AM
1class Solution {
2    long[][] memo;
3    int m,n;
4    int MOD = 1_000_000_007;
5    public int countPaths(int[][] matrix) {
6        m=matrix.length;
7        n=matrix[0].length;
8        memo=new long[m][n];
9        for(int i=0;i<m;i++)
10        Arrays.fill(memo[i],-1);
11        long longest=0;
12        for(int i=0;i<m;i++){
13            for(int j=0;j<n;j++){
14                if(memo[i][j]==-1){
15                    dfs(matrix,i,j);
16                }
17                longest = (longest + memo[i][j]) % MOD;
18            }
19        }
20        return (int) longest;
21    }
22    public long dfs(int[][] matrix,int x,int y){
23        if(memo[x][y]!=-1) return memo[x][y];
24        memo[x][y]=1;
25        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
26        for(int[] i:dir){
27            int newx=i[0]+x;
28            int newy=i[1]+y;
29            if(newx<0 || newy<0 || newx>=m || newy>=n) continue;
30            if(matrix[x][y]<matrix[newx][newy]){
31                if(memo[newx][newy]==-1){
32                    memo[newx][newy]=dfs(matrix,newx,newy);
33                }
34                memo[x][y] = (memo[x][y] + memo[newx][newy]) % MOD;
35            }
36        }
37        
38        return memo[x][y];
39    }
40}