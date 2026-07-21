// Last updated: 7/22/2026, 12:38:44 AM
1class Solution {
2    public int[][] kClosest(int[][] points, int k) {
3        int[][] ans=new int[k][2];
4        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> Double.compare(Math.sqrt(b[1]*b[1]+b[0]*b[0]),Math.sqrt(a[0]*a[0]+a[1]*a[1])));
5        for(int i=0;i<points.length;i++){
6            pq.add(points[i]);
7            if(pq.size()>k){
8                pq.poll();
9            }
10        }
11        int i=0;
12        while(!pq.isEmpty()){
13            ans[i++]=pq.poll();
14        }
15        return ans;
16    }
17}