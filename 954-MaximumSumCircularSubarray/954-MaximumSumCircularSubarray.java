// Last updated: 3/24/2026, 11:25:47 AM
class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int sum=arr[0];
        int cur=arr[0],cmin=arr[0];
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            cur=Math.max(cur+arr[i],arr[i]);
            max=Math.max(max,cur);
            cmin=Math.min(cmin+arr[i],arr[i]);
            min=Math.min(min,cmin);
        }
        if(max<0) return max;
        return Math.max(max,sum-min);
    }
}