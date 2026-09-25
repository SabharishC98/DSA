// Last updated: 9/25/2026, 2:33:37 PM
class Solution {
    public int sumOfBeauties(int[] nums) {
        int n=nums.length;
        int[] max=new int[n];
        int[] min=new int[n];
        max[0]=Integer.MIN_VALUE;
        min[n-1]=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            max[i]=Math.max(max[i-1],nums[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(min[i+1],nums[i+1]);
        }
        int c=0;
        for(int i=1;i<n-1;i++){
            if(nums[i]>max[i] && nums[i]<min[i]) c+=2;
            else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]) c++;
            // System.out.println(nums[i]+" "+min[i]+" "+max[i]+" "+c);
        }
        return c;
    }
}