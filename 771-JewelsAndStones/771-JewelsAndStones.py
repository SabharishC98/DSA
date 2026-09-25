# Last updated: 9/25/2026, 2:44:07 PM
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
        