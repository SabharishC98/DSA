// Last updated: 3/24/2026, 11:25:50 AM
class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public void mergesort(int[] nums,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            mergesort(nums,i,mid);
            mergesort(nums,mid+1,j);
            merge(nums,i,mid,j);
        }
    }
    public void merge(int[] nums,int l,int mid,int r){
        int l1[]=new int[mid-l+1];
        int l2[]=new int[r-mid];
        for(int i=0;i<l1.length;i++){
            l1[i]=nums[l+i];
        }
        for(int i=0;i<l2.length;i++){
            l2[i]=nums[mid+i+1];
        }
        int i=0,j=0,index=l;
        while(i<l1.length && j<l2.length){
            if(l1[i]<=l2[j]){
                nums[index]=l1[i];
                i++;
            }
            else{
                nums[index]=l2[j];
                j++;
            }
            index++;
        }
        while(i<l1.length){
            nums[index++]=l1[i];
            i++;
        }
        while(j<l2.length){
            nums[index++]=l2[j];
            j++;
        }
    }
}