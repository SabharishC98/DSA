// Last updated: 3/25/2026, 11:49:35 AM
1class Solution {
2    public int nthUglyNumber(int n, int a, int b, int c) {
3        long lo = 1, hi = 2_000_000_000L;
4
5        while (lo < hi) {
6            long mid = lo + (hi - lo) / 2;
7
8            if (count(mid, a, b, c) >= n) {
9                hi = mid;
10            } else {
11                lo = mid + 1;
12            }
13        }
14
15        return (int) lo;
16    }
17
18    private long count(long x, long a, long b, long c) {
19        long ab  = lcm(a, b);
20        long bc  = lcm(b, c);
21        long ac  = lcm(a, c);
22        long abc = lcm(ab, c);
23
24        return  x/a + x/b + x/c
25              - x/ab - x/bc - x/ac
26              + x/abc;
27    }
28
29    private long lcm(long x, long y) {
30        return (x / gcd(x, y)) * y;
31    }
32
33    private long gcd(long x, long y) {
34        while (y != 0) {
35            long temp = y;
36            y = x % y;
37            x = temp;
38        }
39        return x;
40    }
41}