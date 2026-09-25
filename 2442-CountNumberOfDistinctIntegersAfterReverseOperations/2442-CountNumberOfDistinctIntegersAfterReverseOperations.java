// Last updated: 9/25/2026, 2:30:52 PM
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> n=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            n.add(nums[i]);
            int k=nums[i],m=0;
            while(k>0){
                m=m*10+(k%10);
                k/=10;
            }
            n.add(m);
        }
        
        return n.size();
    }
}