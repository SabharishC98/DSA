// Last updated: 7/20/2026, 10:21:01 AM
1class Solution {
2    public int shortestPath(int[][] grid, int k) {
3        // PriorityQueue<int[]> dq=new PriorityQueue<>((a,b)->a[0]-b[0]);
4        int n=grid.length,m=grid[0].length;
5        if(n==1 && m==1) return 0;
6        boolean[][][] dp=new boolean[n][m][k+1];
7        // for(int[][] row:dp) for(int[] i:row) Arrays.fill(i,Integer.MAX_VALUE);
8        dp[0][0][k]=true;
9        Queue<int[]> dq=new LinkedList<>();
10        dq.add(new int[]{0,0,k,0});
11        // int min=Integer.MAX_VALUE;
12        int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
13        while(!dq.isEmpty()){
14            int[] temp=dq.poll();
15            // if(dp[temp[0]][temp[1]]>=min) continue;
16            
17            // System.out.println(temp[0]+" "+temp[1]+" "+temp[2]);
18            for(int[] i:dir){
19                int nr=i[0]+temp[0];
20                int nc=i[1]+temp[1];
21                if(nr<0 || nr>=n || nc<0 || nc>=m) continue;
22                if(temp[2]==0 && grid[nr][nc]==1) continue;
23                // if(!dp[nr][nc][temp[2]]){
24                    if(grid[nr][nc]==1 && !dp[nr][nc][temp[2]-1]){
25                        dq.add(new int[]{nr,nc,temp[2]-1,temp[3]+1});
26                        dp[nr][nc][temp[2]-1]=true;
27                        if(nr==n-1 && nc==m-1){
28                            return temp[3]+1;
29                        }
30                    }
31                    else if(grid[nr][nc]!=1 && !dp[nr][nc][temp[2]]){
32                        dq.add(new int[]{nr,nc,temp[2],temp[3]+1});
33                        dp[nr][nc][temp[2]]=true;
34                        if(nr==n-1 && nc==m-1){
35                            return temp[3]+1;
36                        }
37                    }
38                    
39                    
40                // }
41            }
42        }
43        // for(boolean[][] i:dp){
44        //     for(boolean j[]:i){
45        //         for(boolean x:j)
46        //         System.out.print(x+" ");
47        //     }
48        //     System.out.println();
49        // }
50        return -1;
51    }
52}