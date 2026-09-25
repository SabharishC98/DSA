// Last updated: 9/25/2026, 2:38:58 PM
class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, balance = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') balance++;
            else balance--;
            if (balance == 0) count++;
        }
        return count;
    }
}
