// Last updated: 3/24/2026, 11:22:44 AM
class Solution {
    public int minBitFlips(int x, int y) {
        int c=0,xor=x^y;
        while(xor>0){
            if(xor%2==1) c++;
            xor/=2;
        }
        return c;
    }
}