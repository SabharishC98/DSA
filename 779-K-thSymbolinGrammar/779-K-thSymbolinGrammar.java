// Last updated: 6/16/2026, 10:05:21 AM
1class Solution {
2    public int kthGrammar(int n, int k) {
3        return Integer.bitCount(k-1)%2; 
4    }
5}