// Last updated: 3/24/2026, 11:26:36 AM
class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int m = digits.length;
        int mark = m; 
        
        for (int i = m - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i]) {
                mark = i;
                digits[i - 1]--;
            }
        }
        
        for (int i = mark; i < m; i++) {
            digits[i] = '9';
        }
        
        return Integer.parseInt(new String(digits));
    }
}