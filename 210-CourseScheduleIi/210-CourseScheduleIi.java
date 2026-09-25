// Last updated: 9/25/2026, 2:50:38 PM
class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int[] ans=new int[n];
        int[] inorder=new int[n];
        Map<Integer,List<Integer>> adj=new HashMap<>();
        for(int i=0;i<n;i++){
            adj.putIfAbsent(i,new ArrayList<>());
        }
        for(int[] i:prerequisites){
            inorder[i[0]]++;
            adj.get(i[1]).add(i[0]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i]==0) q.add(i);
        }
        int index=0;
        while(!q.isEmpty()){
            int cur=q.poll();
            ans[index++]=cur;
            for(int i:adj.get(cur)){
                inorder[i]--;
                if(inorder[i]==0) q.add(i);
            }
        }
        return index==n?ans:new int[]{};
    }
}