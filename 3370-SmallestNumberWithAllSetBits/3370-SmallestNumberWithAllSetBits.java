// Last updated: 9/25/2026, 2:26:28 PM
class Solution {
    public int smallestNumber(int n) {
        while(true){
            
            if((n&(n+1))==0) return n;
            n++;
        }
    }
}