// Last updated: 9/25/2026, 2:31:42 PM
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            index.put(nums[i],i);
        }
        for(int[] i:operations){
            int in=index.get(i[0]);
            nums[in]=i[1];
            index.remove(i[0]);
            index.put(i[1],in);
        }
        return nums;
    }
}