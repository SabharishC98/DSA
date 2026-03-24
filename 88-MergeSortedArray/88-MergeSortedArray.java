// Last updated: 3/24/2026, 11:31:10 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(i<m+n){
            if(i>m-1){
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
        Arrays.sort(nums1);
    }
}