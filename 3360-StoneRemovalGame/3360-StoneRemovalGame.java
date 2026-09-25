// Last updated: 9/25/2026, 2:26:35 PM
class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int k=10,c=0;
        while(n>=k){
            n-=k;
            k--;
            c++;
        }
        return c%2!=0;
    }
}