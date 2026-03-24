# Last updated: 3/24/2026, 11:21:20 AM
class Solution(object):
    def sumOfTheDigitsOfHarshadNumber(self, x):
        """
        :type x: int
        :rtype: int
        """
        c=0
        n=x
        while x!=0:
            c+=+(x%10)
            x//=10
        if n%c==0:
            return c
        print(c)
        return -1
        