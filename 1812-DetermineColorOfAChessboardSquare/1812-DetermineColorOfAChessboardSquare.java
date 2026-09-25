// Last updated: 9/25/2026, 2:34:54 PM
class Solution {
    public boolean squareIsWhite(String c) {
        return ((c.charAt(0)+c.charAt(1)))%2!=0;
    }
}