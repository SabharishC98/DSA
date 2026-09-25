// Last updated: 9/25/2026, 2:43:06 PM
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] sh = s.toCharArray();
        int n = shifts.length;

        // Step 1: cumulative shifts from the end
        for (int i = n - 2; i >= 0; i--) {
            shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
        }

        // Step 2: shift characters with wrap-around
        for (int i = 0; i < n; i++) {
            int st = shifts[i] % 26;
            sh[i] = (char) ('a' + (sh[i] - 'a' + st) % 26);
        }

        return new String(sh);
    }
}
