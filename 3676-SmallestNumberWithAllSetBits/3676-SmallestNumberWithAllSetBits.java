// Last updated: 3/24/2026, 11:20:57 AM
class Solution {
    public int smallestNumber(int n) {
        while(true){
            
            if((n&(n+1))==0) return n;
            n++;
        }
    }
}