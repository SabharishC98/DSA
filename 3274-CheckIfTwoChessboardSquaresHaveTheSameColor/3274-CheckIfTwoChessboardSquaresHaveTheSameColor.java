// Last updated: 9/25/2026, 2:26:51 PM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0)-97+coordinate1.charAt(1)-48)%2==(coordinate2.charAt(0)-97+coordinate2.charAt(1)-48)%2;
    }
}