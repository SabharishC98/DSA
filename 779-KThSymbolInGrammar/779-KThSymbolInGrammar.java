// Last updated: 9/25/2026, 2:43:53 PM
class Solution {
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k-1)%2; 
    }
}