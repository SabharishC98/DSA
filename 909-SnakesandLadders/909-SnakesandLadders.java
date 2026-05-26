// Last updated: 5/26/2026, 2:26:53 PM
1class Solution {
2    public int snakesAndLadders(int[][] board) {
3        int n=board.length;
4        for(int i=n-1;i>=0;i--){
5            if(n%2==0 && i%2==0){
6                reverse(board[i]);
7            }
8            else if(n%2!=0 && i%2!=0){
9                reverse(board[i]);
10            }
11        }
12        boolean[] vis=new boolean[n*n];
13        Queue<int[]> q=new LinkedList<>();
14        q.add(new int[]{0,0});
15        vis[0]=true;
16        int min=Integer.MAX_VALUE;
17        while(!q.isEmpty()){
18            int[] arr=q.poll();
19            for(int i=1;i<=6;i++){
20
21                int next=i+arr[0];
22                 
23                
24                int r=n-(next/n)-1;
25                int c=(next%n);
26                if(board[r][c]!=-1){
27                    next=board[r][c]-1;
28                }
29                // System.out.println(arr[0]+" "+next+" "+i+" "+r+" "+c+" "+(board[r][c]-1));
30                if(next==n*n-1){
31                //    System.out.println(arr[0]+" "+next+" "+i);
32                    return arr[1]+1;
33                }
34                if(!vis[next]){
35                    q.add(new int[]{next,arr[1]+1});
36                    vis[next]=true;
37                }
38            }
39        }
40        return -1;
41    }
42    public void reverse(int[] board){
43        int n=board.length-1,i=0;
44        while(i<n){
45            int t=board[i];
46            board[i]=board[n];
47            board[n]=t;
48            n--; 
49            i++;
50        }
51        
52    }
53}