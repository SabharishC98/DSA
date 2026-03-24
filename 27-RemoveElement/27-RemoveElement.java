// Last updated: 3/24/2026, 11:32:20 AM
class Solution {
    public int removeElement(int[] arr, int val) {
        int i=0,k=0;
        while(i<arr.length){
            if(arr[i]!=val){
                arr[k]=arr[i];
                k++;
            }
            i++;
        }
        return k;
    }
}