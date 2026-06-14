// Last updated: 6/14/2026, 11:54:09 PM
1class Solution {
2    public int[] mostCompetitive(int[] nums, int k) {
3        int n=nums.length;
4        Deque<Integer> st=new ArrayDeque<>();
5        for(int i=0;i<n;i++){
6            while(!st.isEmpty() && st.peek()>nums[i] && st.size()+(n-i)>k){
7                st.pop();
8            }
9            st.push(nums[i]);
10        }
11        while(st.size()>k) st.poll();
12        int[] arr=new int[k];
13        int i=0;
14        while(!st.isEmpty()){
15            arr[i++]=st.pollLast();
16        }
17        return arr;
18    }
19}