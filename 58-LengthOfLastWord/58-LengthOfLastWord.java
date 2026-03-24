// Last updated: 3/24/2026, 11:31:42 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        return str[str.length-1].length();

    }
}