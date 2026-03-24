// Last updated: 3/24/2026, 11:27:05 AM
class Solution {
    public int findLHS(int[] nums) {
        // int max=0;
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i: nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // for(int i:map.keySet()){
        //     if(map.containsKey(i+1))
        //     max=Math.max(max,map.get(i)+map.get(i+1));
        // }
        // return max;
        Arrays.sort(nums);
        int si=0,l,max=0;
        for(int li=1;li<nums.length;li++){
            if(nums[li]-nums[si]==1){
                l=li-si+1;
                if(max<l) max=l;
            }
            while((nums[li]-nums[si])>1 && si<li) si++;
        }
        return max;
    }
}