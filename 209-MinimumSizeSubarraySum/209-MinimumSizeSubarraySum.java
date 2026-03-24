// Last updated: 3/24/2026, 11:29:27 AM
class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min=Integer.MAX_VALUE,sum=0;
        if(arr[0]>=target) return min=1;
        int i=0,j=1;
        if(arr.length==1) return 0;
        sum+=arr[i]+arr[j];
        while(j<arr.length){
            if(sum>=target && min>j-i+1){
                min=j-i+1;
            }
            if(sum<target){
                j++;
                if(j==arr.length) break;
                sum+=arr[j];
            }
            else{
                i++;
                sum-=arr[i-1];
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;

    }
}