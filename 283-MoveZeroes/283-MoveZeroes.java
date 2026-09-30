// Last updated: 9/30/2026, 10:07:39 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int i=0,j=0;
4        while(j<nums.length){
5            if(nums[j]==0){
6                while(i<nums.length-1 && nums[i]==0){
7                    i++;
8                }
9                int t=nums[i];
10                nums[i]=nums[j];
11                nums[j]=t;
12                
13                // System.out.println(i+" "+j);
14            }
15            j++;
16            if(i<j)
17            i=j;
18        }
19    }
20}