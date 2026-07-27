// Last updated: 7/27/2026, 2:03:24 PM
1class Solution {
2    public int partitionDisjoint(int[] nums) {
3        int n=nums.length;
4        int[] lmax=new int[n];
5        int[] rmax=new int[n];
6        lmax[0]=nums[0];
7        rmax[n-1]=nums[n-1];
8        for(int i=1;i<n;i++){
9            lmax[i]=Math.max(nums[i],lmax[i-1]);
10        }
11        for(int i=n-2;i>=0;i--){
12            rmax[i]=Math.min(rmax[i+1],nums[i]);
13        }
14        for(int i=0;i<n-1;i++){
15            if(lmax[i]<=rmax[i+1]) return i+1;
16        }
17        return 0;
18    }
19}