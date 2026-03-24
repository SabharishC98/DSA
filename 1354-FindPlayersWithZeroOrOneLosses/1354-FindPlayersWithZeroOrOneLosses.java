// Last updated: 3/24/2026, 11:24:48 AM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] i:matches){
            if(!map.containsKey(i[0]))
            map.put(i[0],0);
            map.put(i[1],map.getOrDefault(i[1],0)+1);
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==0) l1.add(i);
            if(map.get(i)==1) l2.add(i);
        }
        Collections.sort(l1);
        Collections.sort(l2);
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}