// Last updated: 3/24/2026, 11:29:23 AM
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int arr1[]=new int[nums.length-1];
        int arr2[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            arr1[i]=nums[i];
            arr2[i]=nums[i+1];
        }
        int x=check(nums.length-1,arr1);
        int y=check(nums.length-1,arr2);
        return Math.max(x,y);
    }
    public int check(int n,int[] arr){
        int p2=arr[0];
        if(n==1) return p2;
        int p1=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            int pick=arr[i]+p2;
            int not=p1;
            int cur=Math.max(pick,not);
            p2=p1;
            p1=cur;
        }
        return p1;
    }
}