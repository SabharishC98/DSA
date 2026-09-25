// Last updated: 9/25/2026, 2:41:30 PM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}