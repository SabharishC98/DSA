// Last updated: 3/24/2026, 11:25:21 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=weights[0],right=0;
        for(int i:weights){
            right+=i;
            left=Math.max(left,i);
        }
        while(left<right){
            int mid=(left+right)/2;
            if(ship(weights,days,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean ship(int[] weights,int days,int capacity){
        int cur=0,ans=1;
        for(int i:weights){
            if(cur+i>capacity){
                ans++;
                cur=i;
                if(ans>days) return false;
            }
            else{
                cur+=i;
            }
        }
        return ans<=days;
    }
}