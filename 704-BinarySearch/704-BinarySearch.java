// Last updated: 9/25/2026, 2:43:54 PM
class Solution {
    public int search(int[] arr, int target) {
        int s=0,e=arr.length-1,m=0;
        while(s<=e){
            m=(s+e)/2;
            if(arr[m]==target){
                return m;
            }
            if(target>arr[m])   s=m+1;
            else e=m-1;
        }
        return -1;
    }
}