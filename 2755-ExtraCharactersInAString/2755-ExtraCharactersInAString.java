// Last updated: 3/24/2026, 11:21:52 AM
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;

        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));

        for (int i = 0; i < n; i++) {
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (dict.contains(sub)) {
                    dp[j + 1] = Math.min(dp[j + 1], dp[i]);
                }
            }
        }
        return dp[n];
    }
}
