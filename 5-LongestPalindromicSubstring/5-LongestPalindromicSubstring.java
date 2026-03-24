// Last updated: 3/24/2026, 11:32:46 AM
class Solution {
    public String longestPalindrome(String s) {
      int start = 0;      
        int maxLen = 1;    

        for (int i = 0; i < s.length(); i++) {

            int oddLen = stretch(s, i, i);

            int evenLen = stretch(s, i, i + 1);

            int bestLen = Math.max(oddLen, evenLen);

            if (bestLen > maxLen) {
                maxLen = bestLen;
                start = i - (bestLen - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private int stretch(String s, int left, int right) {

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;  
    }
}