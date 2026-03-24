# Last updated: 3/24/2026, 11:29:09 AM
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n==0:
            return False
        return (n & (n-1))==0
        