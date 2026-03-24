// Last updated: 3/24/2026, 11:21:03 AM
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return (coordinate1.charAt(0)-97+coordinate1.charAt(1)-48)%2==(coordinate2.charAt(0)-97+coordinate2.charAt(1)-48)%2;
    }
}