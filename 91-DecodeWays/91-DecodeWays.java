// Last updated: 3/24/2026, 11:31:08 AM
class Solution {
    int[] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()];
        Arrays.fill(memo, -1);
        return check(s, 0);
    }
    public int check(String s, int ind) {
        int n = s.length();
        if (ind >= n) return 1;
        if (memo[ind] != -1) return memo[ind];
        
        int ways = 0;
        if (s.charAt(ind) != '0') ways = check(s, ind + 1);
        if (ind + 1 < n && ((s.charAt(ind) == '1') || 
            (s.charAt(ind) == '2' && s.charAt(ind + 1) <= '6'))) {
            ways += check(s, ind + 2);
        }
        
        return memo[ind] = ways;
    }
}