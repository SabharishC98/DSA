// Last updated: 9/25/2026, 2:35:57 PM
class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>nums[i] && st.size()+(n-i)>k){
                st.pop();
            }
            st.push(nums[i]);
        }
        while(st.size()>k) st.poll();
        int[] arr=new int[k];
        int i=0;
        while(!st.isEmpty()){
            arr[i++]=st.pollLast();
        }
        return arr;
    }
}