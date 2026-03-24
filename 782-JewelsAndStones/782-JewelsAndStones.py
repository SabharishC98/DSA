# Last updated: 3/24/2026, 11:26:24 AM
class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        c=0
        for i in stones:
            if i in jewels:
                c+=1
        return c
        