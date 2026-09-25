# Last updated: 9/25/2026, 2:27:45 PM
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
        