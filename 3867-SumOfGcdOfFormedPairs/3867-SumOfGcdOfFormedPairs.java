// Last updated: 9/25/2026, 2:24:59 PM
class Solution {
    public long gcdSum(int[] nums) {
        // Arrays.sort(nums);
        long sum=0L;
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(max,nums[i]);
            // System.out.println(prefix[i]);
        }
        Arrays.sort(prefix);
        int i=0,j=nums.length-1;
        while(i<j){
            sum+=gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
        // return 0L;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}