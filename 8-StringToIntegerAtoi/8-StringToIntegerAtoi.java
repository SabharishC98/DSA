// Last updated: 3/24/2026, 11:32:43 AM
class Solution {
    public int myAtoi(String s1) {
        if (s1 == null) return 0;

        String s = s1.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        long ans = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length()) {
            int ch = s.charAt(i) - '0';
            if (ch < 0 || ch > 9) break;

            ans = ans * 10 + ch;

            if (sign == 1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * ans);
    }
}
