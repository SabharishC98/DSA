// Last updated: 9/25/2026, 2:27:00 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int t=Math.min(x,y/4);
        if(t%2==0) return "Bob";
return "Alice";    }
}