// Last updated: 3/24/2026, 11:25:36 AM
class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 1; i <= 9; i++) {
            back(i, n - 1, i, k, ans);
        }
        int[] arr = new int[ans.size()];
        int i = 0;
        for (int j : ans) arr[i++] = j;
        return arr;
    }

    public void back(int digit, int remaining, int number, int k, Set<Integer> ans) {
        if (remaining == 0) {
            ans.add(number);
            return;
        }
        // Try adding k
        if (digit + k <= 9)
            back(digit + k, remaining - 1, number * 10 + (digit + k), k, ans);
        // Try subtracting k (avoid duplicate when k == 0)
        if (digit - k >= 0 && k != 0)
            back(digit - k, remaining - 1, number * 10 + (digit - k), k, ans);
    }
}