// Last updated: 9/25/2026, 2:27:05 PM
class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] ans=new int[queries.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<queries.length;i++){
            pq.add(Math.abs(queries[i][0])+Math.abs(queries[i][1]));
            if(pq.size()<k){
                ans[i]=-1;
                continue;
            }
            if(pq.size()>k){
                pq.poll();
            }
            ans[i]=pq.peek();
        }
        return ans;
    }
}