// Last updated: 7/27/2026, 12:26:19 PM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int c=0;
4        for(int i=0;i<nums.length-1;i++){
5            
6            if(nums[i]>nums[i+1]){
7                c++;
8                if(c>1) return false;
9                if(i==0 || nums[i-1]<=nums[i+1]){
10                    nums[i]=nums[i+1];
11                }
12                else{
13                    nums[i+1]=nums[i];
14                }
15            }
16        }
17        return true;
18    }
19}