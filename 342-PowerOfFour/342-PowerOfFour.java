// Last updated: 3/24/2026, 11:28:25 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        float k=n;
        
        while(k>4){
            k/=4;
        }
        return k==4;
    }
}