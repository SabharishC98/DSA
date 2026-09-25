// Last updated: 9/25/2026, 2:32:39 PM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:nums) if(map.get(i)==1 && !map.containsKey(i+1) && !map.containsKey(i-1)) list.add(i);
        return list;
    }
}