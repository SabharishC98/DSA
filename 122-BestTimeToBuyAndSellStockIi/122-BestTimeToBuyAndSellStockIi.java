// Last updated: 3/24/2026, 11:30:31 AM
class Solution {
    public int maxProfit(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p+=prices[i]-prices[i-1];
            }
        }
        return p;
    }
}