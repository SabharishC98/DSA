// Last updated: 9/25/2026, 2:41:27 PM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> Double.compare(Math.sqrt(b[1]*b[1]+b[0]*b[0]),Math.sqrt(a[0]*a[0]+a[1]*a[1])));
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }
        return ans;
    }
}