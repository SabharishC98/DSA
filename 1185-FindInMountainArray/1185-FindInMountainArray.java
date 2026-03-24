// Last updated: 3/24/2026, 11:25:06 AM
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak=check(arr);
        int left=lbinary(0,peak,arr,target);
        int right=rbinary(peak,arr.length()-1,arr,target);
        if(left==-1 && right==-1) return left;
        if(left!=-1) return left;
        return right;
    }
    public int check( MountainArray arr){
        int start=0,end=arr.length()-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(mid!=arr.length()-1 && arr.get(mid)>arr.get(mid+1))
            {
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
    public int lbinary(int i,int j, MountainArray arr,int target){
        int st=i,end=j;
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr.get(mid)==target) return mid;
            else if(arr.get(mid)<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
            if(i<st || j>end) break;
        }
        return -1;
    }
    public int rbinary(int i,int j, MountainArray arr,int target){
        int st=i,end=j;
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr.get(mid)==target) return mid;
            else if(arr.get(mid)>target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
            if(i<st || j>end) break;
        }
        return -1;
    }
}