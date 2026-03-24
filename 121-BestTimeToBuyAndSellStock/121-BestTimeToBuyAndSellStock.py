# Last updated: 3/24/2026, 11:30:32 AM
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit=0
        min_price=float('inf')
        for i in prices:
            if i<min_price:
                min_price=i
            profit=i-min_price
            if max_profit<profit:
                max_profit=profit
        return max_profit
        