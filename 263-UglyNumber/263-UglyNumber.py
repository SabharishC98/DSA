# Last updated: 3/24/2026, 11:28:53 AM
class Solution(object):
    def isUgly(self, n):
        """
        :type n: int
        :rtype: bool
        """
        l=[2,3,5]
        if n<1:
            return False

        for i in l:
            while(n%i==0):
                n//=i
        if n==1:
            return True
        return False
        