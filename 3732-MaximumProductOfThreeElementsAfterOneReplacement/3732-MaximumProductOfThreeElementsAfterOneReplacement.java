// Last updated: 9/25/2026, 2:25:15 PM
class Solution {
    public long maxProduct(int[] nums) {
        long f=0,s=0;
        for(int i:nums){
            if(Math.abs(i)>f){
                s=f;
                f=Math.abs(i);
            }
            else if(Math.abs(i)>s){
                s=Math.abs(i);
            }
        }
        return f*s*100000;
    }
}