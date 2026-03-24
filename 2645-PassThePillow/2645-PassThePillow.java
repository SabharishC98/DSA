// Last updated: 3/24/2026, 11:22:05 AM
class Solution {
    public int passThePillow(int n, int t) {
        t=t%((n-1)*2);
        if(t<n) return t+1;
        return ((n-1)*2)-t+1;
    }
}