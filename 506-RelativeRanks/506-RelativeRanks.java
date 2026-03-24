// Last updated: 3/24/2026, 11:27:38 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer,String> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<score.length;i++){
            pq.offer(score[i]);
        }
        while(!pq.isEmpty()){
            if(pq.size()==3){
                map.put(pq.poll(),"Bronze Medal");
            }
            else if(pq.size()==2){
                map.put(pq.poll(),"Silver Medal");
            }
            else if(pq.size()==1){
                map.put(pq.poll(),"Gold Medal");
            }
            else{
                map.put(pq.poll(),String.valueOf(pq.size()+1));
            }
        }
        String[] ans=new String[score.length];
        for(int i=0;i<score.length;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}