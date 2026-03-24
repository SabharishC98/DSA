// Last updated: 3/24/2026, 11:27:28 AM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,-1);
        int sum=0,max=0,l;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) sum-=1;
            else sum+=1;
            if(m.containsKey(sum)){
                l=i-m.get(sum);
                max=Math.max(max,l);
            }
            else m.put(sum,i);
        }
        return max;
    }
}