// Last updated: 9/25/2026, 2:39:08 PM
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long lo = 1, hi = 2_000_000_000L;

        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;

            if (count(mid, a, b, c) >= n) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return (int) lo;
    }

    private long count(long x, long a, long b, long c) {
        long ab  = lcm(a, b);
        long bc  = lcm(b, c);
        long ac  = lcm(a, c);
        long abc = lcm(ab, c);

        return  x/a + x/b + x/c
              - x/ab - x/bc - x/ac
              + x/abc;
    }

    private long lcm(long x, long y) {
        return (x / gcd(x, y)) * y;
    }

    private long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}