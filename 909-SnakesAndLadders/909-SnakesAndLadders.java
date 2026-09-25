// Last updated: 9/25/2026, 2:42:19 PM
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        for(int i=n-1;i>=0;i--){
            if(n%2==0 && i%2==0){
                reverse(board[i]);
            }
            else if(n%2!=0 && i%2!=0){
                reverse(board[i]);
            }
        }
        boolean[] vis=new boolean[n*n];
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{0,0});
        vis[0]=true;
        int min=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int[] arr=q.poll();
            for(int i=1;i<=6;i++){

                int next=i+arr[0];
                 
                
                int r=n-(next/n)-1;
                int c=(next%n);
                if(board[r][c]!=-1){
                    next=board[r][c]-1;
                }
                // System.out.println(arr[0]+" "+next+" "+i+" "+r+" "+c+" "+(board[r][c]-1));
                if(next==n*n-1){
                //    System.out.println(arr[0]+" "+next+" "+i);
                    return arr[1]+1;
                }
                if(!vis[next]){
                    q.add(new int[]{next,arr[1]+1});
                    vis[next]=true;
                }
            }
        }
        return -1;
    }
    public void reverse(int[] board){
        int n=board.length-1,i=0;
        while(i<n){
            int t=board[i];
            board[i]=board[n];
            board[n]=t;
            n--; 
            i++;
        }
        
    }
}