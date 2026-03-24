// Last updated: 3/24/2026, 11:27:45 AM
class Solution {
    int ans=0;
    public int reversePairs(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return ans;
    }
    public void mergesort(int[] nums,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public void merge(int[] nums,int l,int mid,int r){
        int left=mid-l+1;
        int right=r-mid;
        int[] larr=new int[left];
        int[] rarr=new int[right];
        int j = mid + 1;
        for (int i = l; i <= mid; i++) {
            while (j <= r && nums[i] > 2L * nums[j]) {
                j++;
            }
            ans += (j - (mid + 1));  
        }
        for(int i=l;i<=mid;i++) larr[i-l]=nums[i];
        for(int i=mid+1;i<=r;i++) rarr[i-mid-1]=nums[i];
        int i=0;j=0;
        while(i<left && j<right){
            if(larr[i]<=rarr[j]){
                nums[l++]=larr[i++];
            }
            else nums[l++]=rarr[j++];
        }
        while(i<left) nums[l++]=larr[i++];
        while(j<right) nums[l++]=rarr[j++];
    }
}