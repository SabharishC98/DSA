// Last updated: 9/25/2026, 2:38:31 PM
class Solution {
    public int shortestPath(int[][] grid, int k) {
        // PriorityQueue<int[]> dq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int n=grid.length,m=grid[0].length;
        if(n==1 && m==1) return 0;
        boolean[][][] dp=new boolean[n][m][k+1];
        // for(int[][] row:dp) for(int[] i:row) Arrays.fill(i,Integer.MAX_VALUE);
        dp[0][0][k]=true;
        Queue<int[]> dq=new LinkedList<>();
        dq.add(new int[]{0,0,k,0});
        // int min=Integer.MAX_VALUE;
        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!dq.isEmpty()){
            int[] temp=dq.poll();
            // if(dp[temp[0]][temp[1]]>=min) continue;
            
            // System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
            for(int[] i:dir){
                int nr=i[0]+temp[0];
                int nc=i[1]+temp[1];
                if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
                if(temp[2]==0 && grid[nr][nc]==1) continue;
                // if(!dp[nr][nc][temp[2]]){
                    if(grid[nr][nc]==1 && !dp[nr][nc][temp[2]-1]){
                        dq.add(new int[]{nr,nc,temp[2]-1,temp[3]+1});
                        dp[nr][nc][temp[2]-1]=true;
                        if(nr==n-1 && nc==m-1){
                            return temp[3]+1;
                        }
                    }
                    else if(grid[nr][nc]!=1 && !dp[nr][nc][temp[2]]){
                        dq.add(new int[]{nr,nc,temp[2],temp[3]+1});
                        dp[nr][nc][temp[2]]=true;
                        if(nr==n-1 && nc==m-1){
                            return temp[3]+1;
                        }
                    }
                    
                    
                // }
            }
        }
        // for(boolean[][] i:dp){
        //     for(boolean j[]:i){
        //         for(boolean x:j)
        //         System.out.print(x+" ");
        //     }
        //     System.out.println();
        // }
        return -1;
    }
}