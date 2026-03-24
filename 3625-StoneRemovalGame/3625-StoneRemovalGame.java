// Last updated: 3/24/2026, 11:21:01 AM
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