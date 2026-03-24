// Last updated: 3/24/2026, 11:27:29 AM
class Solution {

    // Check if 'sub' is a subsequence of 'str'
    private boolean isSubsequence(String sub, String str) {
        int i = 0, j = 0;
        while (i < sub.length() && j < str.length()) {
            if (sub.charAt(i) == str.charAt(j)) i++;
            j++;
        }
        return i == sub.length();   // all chars of sub were matched
    }

    public int findLUSlength(String[] strs) {
        int ans = -1;

        for (int i = 0; i < strs.length; i++) {
            boolean isCommon = false;

            for (int j = 0; j < strs.length; j++) {
                if (i == j) continue;              // skip comparing with itself

                if (isSubsequence(strs[i], strs[j])) {
                    isCommon = true;               // strs[i] IS a subseq of strs[j]
                    break;                         // no need to check further
                }
            }

            if (!isCommon) {
                ans = Math.max(ans, strs[i].length());
            }
        }

        return ans;
    }
}