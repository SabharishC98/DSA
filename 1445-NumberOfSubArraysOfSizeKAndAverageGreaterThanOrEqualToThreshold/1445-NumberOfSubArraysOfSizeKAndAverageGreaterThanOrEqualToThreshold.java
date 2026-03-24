// Last updated: 3/24/2026, 11:24:35 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold) c++;
        for(int i=1;i<arr.length-k+1;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            if(sum/k>=threshold) c++;
        }
        return c;
    }
}