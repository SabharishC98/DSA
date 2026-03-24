// Last updated: 3/24/2026, 11:27:52 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int c=0,xor=x^y;
        while(xor>0){
            if(xor%2==1) c++;
            xor/=2;
        }
        return c;
    }
}