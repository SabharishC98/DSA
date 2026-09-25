// Last updated: 9/25/2026, 2:40:07 PM
class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int pivot=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1) return arr;
        for(int i=arr.length-1;i>=0;i--){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            if(arr[i]<arr[pivot]){
                int t=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=t;
                break;
            }
        }
        return arr;
    }
}