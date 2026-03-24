// Last updated: 3/24/2026, 11:29:02 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] l=new int[nums.length];
        int[] r=new int[nums.length];
        int i=1;
        l[0]=1;
        while(i<nums.length){
            l[i]=nums[i-1]*l[i-1];
            i++;
        }
        i=nums.length-2;
        r[nums.length-1]=1;
        while(i>=0){
            r[i]=r[i+1]*nums[i+1];
            i--;
        }
        for(i=0;i<nums.length;i++){
            l[i]*=r[i];
        }
        return l;
    }
}