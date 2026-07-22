// Last updated: 7/22/2026, 1:51:45 PM
1class Solution {
2    public int minRectanglesToCoverPoints(int[][] points, int w) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> a-b);
4        for(int[] i:points){
5            pq.add(i[0]);
6        }
7        int c=0,st=-1;
8        while(!pq.isEmpty()){
9            if(st==-1){
10                st=pq.poll();
11                c++;
12            }
13            else if(pq.peek()-st>w){
14                st=-1;
15            }
16            else{
17                pq.poll();
18            }
19        }
20        return c;
21    }
22}