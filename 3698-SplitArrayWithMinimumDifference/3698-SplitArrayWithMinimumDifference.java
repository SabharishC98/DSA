// Last updated: 9/25/2026, 2:25:40 PM
class Solution {
    public long splitArray(int[] nums) {
        long prefix[]=new long[nums.length];
        boolean[] inc=new boolean[nums.length];
        boolean[] dec=new boolean[nums.length];
        prefix[0]=nums[0];
        inc[0]=true;
        long min=-1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
            if(nums[i]>nums[i-1]){
                inc[i]=inc[i-1];
            }
        }
        dec[nums.length-1]=true;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]) dec[i]=dec[i+1];
        }
        for(int i=1;i<nums.length;i++){
            if(inc[i-1] && dec[i]){
                long diff = Math.abs(prefix[nums.length - 1] - 2 * prefix[i - 1]);
                if (min == -1 || diff < min)
                    min = diff;
            }
        }
        // for(int i=1;i<nums.length;i++) System.out.println(i+" "+inc[i]+" "+dec[i]+" "+prefix[i]+" "+prefix[i-1]);
        return min;
    }
}