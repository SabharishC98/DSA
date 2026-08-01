// Last updated: 8/2/2026, 1:09:07 AM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        return check(0,nums.length-1,nums,0,0,0);
4    }
5    public boolean check(int l,int r,int[] nums,int s1,int s2,int turn){
6        if(l>r){
7            return s1>=s2;
8        }
9        if(turn==0){
10            return check(l+1,r,nums,s1+nums[l],s2,1) || check(l,r-1,nums,s1+nums[r],s2,1);
11        }
12        else{
13            return check(l+1,r,nums,s1,s2+nums[l],0) && check(l,r-1,nums,s1,s2+nums[r],0);
14        }
15    }
16}