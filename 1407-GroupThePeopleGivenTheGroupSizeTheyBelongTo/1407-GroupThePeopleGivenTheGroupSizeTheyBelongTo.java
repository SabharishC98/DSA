// Last updated: 3/24/2026, 11:24:43 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        int n=groupSizes.length;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(groupSizes[i],new ArrayList<>());
            hm.get(groupSizes[i]).add(i);
            if(hm.get(groupSizes[i]).size()==groupSizes[i]){
                result.add(new ArrayList<>(hm.get(groupSizes[i])));
                hm.remove(groupSizes[i]);
            }
        }
        return result;
    }
}