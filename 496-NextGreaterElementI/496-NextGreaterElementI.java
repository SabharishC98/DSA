// Last updated: 3/24/2026, 11:27:42 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i: nums2){
            while(!st.isEmpty() && st.peek()<i){
                map.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.isEmpty()) map.put(st.pop(),-1);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}