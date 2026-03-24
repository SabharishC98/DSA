// Last updated: 3/24/2026, 11:31:32 AM
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
        int i=0,j=x/2,res=1;
        while(i<=j){
            int mid=(i+j)/2;
            long m=(long)mid*mid;
            if(m==x) return mid;
            else if(m<x){
                res=mid;
                i=mid+1;
            }
            else j=mid-1;
        }
        return res;
    }
}