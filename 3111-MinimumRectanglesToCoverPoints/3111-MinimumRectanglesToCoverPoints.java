// Last updated: 9/25/2026, 2:27:42 PM
class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> a-b);
        for(int[] i:points){
            pq.add(i[0]);
        }
        int c=0,st=-1;
        while(!pq.isEmpty()){
            if(st==-1){
                st=pq.poll();
                c++;
            }
            else if(pq.peek()-st>w){
                st=-1;
            }
            else{
                pq.poll();
            }
        }
        return c;
    }
}