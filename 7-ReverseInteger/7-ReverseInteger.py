# Last updated: 3/24/2026, 11:32:44 AM
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        k=0
        m=1
        if x<0:
            m=-1
            x*=-1
        while(x>0):
            k=k*10+x%10
            x//=10
        if k>(2**31-1):
            return 0
        return k*m

        