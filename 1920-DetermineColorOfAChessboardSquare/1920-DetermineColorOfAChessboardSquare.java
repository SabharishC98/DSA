// Last updated: 3/24/2026, 11:23:37 AM
class Solution {
    public boolean squareIsWhite(String c) {
        return ((c.charAt(0)+c.charAt(1)))%2!=0;
    }
}