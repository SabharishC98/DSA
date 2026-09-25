// Last updated: 9/25/2026, 2:38:49 PM
class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int sumOddCount = 0, ans = 0;
        while (j < n) {
            if (arr[j] % 2 == 1) {
                sumOddCount++;
            }

            while (sumOddCount > k) {
                if (arr[i] % 2 == 1) {
                    sumOddCount--;
                }
                i++;
            }
            int start = i;
            while (sumOddCount == k && start <= j) {
                ans++;
                if (arr[start] % 2 == 1) {
                    break;
                }
                start++;
            }

            j++;
        }

        return ans;
    }
}