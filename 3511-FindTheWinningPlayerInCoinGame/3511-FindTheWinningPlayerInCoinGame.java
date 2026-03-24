// Last updated: 3/24/2026, 11:21:18 AM
class Solution {
    public String winningPlayer(int x, int y) {
        int t=Math.min(x,y/4);
        if(t%2==0) return "Bob";
return "Alice";    }
}