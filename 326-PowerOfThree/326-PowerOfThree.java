// Last updated: 3/24/2026, 11:28:33 AM
class Solution {
    public boolean isPowerOfThree(double k) {
        if(k==1 || k==3) return true;
        if(k<3) return false;
        return isPowerOfThree(k/3);
        // if(n==1) return true;
        // double k=n;
        
        // while(k>3){
        //     k/=3;
        // }
        // return k==3;
    }
}