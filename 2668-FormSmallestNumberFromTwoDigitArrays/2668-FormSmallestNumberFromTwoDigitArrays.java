// Last updated: 3/24/2026, 11:22:02 AM
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int same=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    same=nums1[i];
                    break;
                }
            }
            if(same!=0) break;
        }
        if(same!=0) return same;
        if(nums1[0]<=nums2[0]) return nums1[0]*10+nums2[0];
        else return nums2[0]*10+nums1[0];
    }
}