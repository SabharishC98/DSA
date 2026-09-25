// Last updated: 9/25/2026, 2:30:06 PM
class Solution {
    public int passThePillow(int n, int t) {
        t=t%((n-1)*2);
        if(t<n) return t+1;
        return ((n-1)*2)-t+1;
    }
}