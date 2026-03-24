// Last updated: 3/24/2026, 11:25:35 AM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}