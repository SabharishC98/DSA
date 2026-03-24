// Last updated: 3/24/2026, 11:27:18 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            int dif=sum[i]-k;
            if(map.containsKey(dif)){
                c+=map.get(dif);
            }
            map.put(sum[i],map.getOrDefault(sum[i],0)+1);
        }
    return c;
    }
}