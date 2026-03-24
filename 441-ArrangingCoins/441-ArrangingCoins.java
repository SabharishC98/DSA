// Last updated: 3/24/2026, 11:28:00 AM
class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int c=0;
        for(int i=1;i<=n;i++){
            n-=i;
            c++;
        }
        return c;
    }
}