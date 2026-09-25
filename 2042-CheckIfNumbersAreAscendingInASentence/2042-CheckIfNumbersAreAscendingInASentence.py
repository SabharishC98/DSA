# Last updated: 9/25/2026, 2:33:26 PM
class Solution(object):
    def areNumbersAscending(self, s):
        """
        :type s: str
        :rtype: bool
        """
        k=0
        l=s.split()
        for i in l:
            if i.isdigit():
                if int(i)<=k: 
                    return False
                k=int(i)
        return True
        