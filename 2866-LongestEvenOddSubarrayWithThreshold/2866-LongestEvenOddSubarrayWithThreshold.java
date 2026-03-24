// Last updated: 3/24/2026, 11:21:42 AM
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max=0,si=0,li=0;
        boolean check=true;
        while(li<nums.length){
            if(nums[li]%2==0 && check==true && nums[li]<=threshold){
                check=false;
                li++;
                if(li==nums.length) max=Math.max(max,li-si);
            }
            else if(nums[li]%2!=0 && check==false && nums[li]<=threshold){
                check=true;
                li++;
                if(li==nums.length) max=Math.max(max,li-si);
            }
            else{
                max=Math.max(max,li-si);

                if (nums[li] <= threshold && nums[li] % 2 == 0) {
                    si = li;
                    check = false; 
                } else {
                    si = li + 1;        
                    check = true;   
                }
                li++; 
            }

        }
        return max;
    }
}