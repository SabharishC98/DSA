// Last updated: 3/24/2026, 11:28:22 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1[]=new int[1001];
        int n2[]=new int[1001];
        for(int i=0;i<nums1.length;i++){
            n1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            n2[nums2[i]]++;
        }
        Set<Integer> mySet = new HashSet<>();
        int min=nums1.length<nums2.length?nums1.length:nums2.length;
        for(int i=0;i<min;i++){
            if(min==nums1.length){
            if(n1[nums1[i]]!=0 && n2[nums1[i]]!=0){ mySet.add(nums1[i]);}}
            else{
                if(n1[nums2[i]]!=0 && n2[nums2[i]]!=0){ mySet.add(nums2[i]);}
            }

        }
        int index=0;
        int arr[]=new int[mySet.size()];
        for(int i:mySet){
            arr[index++]=i;
        }
        return arr;
    }
}