// Last updated: 3/24/2026, 11:24:49 AM
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
