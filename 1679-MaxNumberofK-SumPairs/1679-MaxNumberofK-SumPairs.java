// Last updated: 6/18/2026, 9:32:56 AM
1class Solution {
2    public int maxOperations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int i=0,j=nums.length-1,c=0;
5        while(i<j){
6            if(nums[i]+nums[j]==k){
7                c++;
8                i++;
9                j--;
10            }
11            else if(nums[i]+nums[j]>k){
12                j--;
13            }
14            else{
15                i++;
16            }
17        }
18        return c;
19    }
20}