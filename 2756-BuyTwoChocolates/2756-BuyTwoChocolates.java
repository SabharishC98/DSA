// Last updated: 3/24/2026, 11:21:51 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(money>=prices[0]+prices[1]) return money-(prices[0]+prices[1]);
        return money;
    }
}