// Last updated: 3/24/2026, 11:26:58 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        long i=0,j=(long)Math.sqrt(c);
        while(i<=j){
            if(i*i+j*j==c) return true;
            else if(i*i+j*j>c) j--;
            else i++;
        }
        return false;
    }
}