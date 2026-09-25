// Last updated: 9/25/2026, 2:47:00 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        return check(0,nums.length-1,nums,0,0,0);
    }
    public boolean check(int l,int r,int[] nums,int s1,int s2,int turn){
        if(l>r){
            return s1>=s2;
        }
        if(turn==0){
            return check(l+1,r,nums,s1+nums[l],s2,1) || check(l,r-1,nums,s1+nums[r],s2,1);
        }
        else{
            return check(l+1,r,nums,s1,s2+nums[l],0) && check(l,r-1,nums,s1,s2+nums[r],0);
        }
    }
}