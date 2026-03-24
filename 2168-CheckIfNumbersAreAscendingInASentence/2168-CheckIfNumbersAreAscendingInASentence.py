# Last updated: 3/24/2026, 11:23:08 AM
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
        