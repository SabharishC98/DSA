// Last updated: 9/25/2026, 2:32:14 PM
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