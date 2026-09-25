// Last updated: 9/25/2026, 2:29:25 PM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(money>=prices[0]+prices[1]) return money-(prices[0]+prices[1]);
        return money;
    }
}