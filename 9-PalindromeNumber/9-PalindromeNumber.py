# Last updated: 3/24/2026, 11:32:41 AM
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        self.x=x
        s=str(x)
        if s==str(x)[::-1]:
            return True
        return False
        