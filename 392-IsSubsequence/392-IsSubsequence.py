# Last updated: 3/24/2026, 11:28:14 AM
class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if s=="":
            return True
        if s==t:
            return True
        j=0
        for i in range(len(t)):
            if s[j]==t[i]:
                if j==len(s)-1:
                    return True
                j+=1
        return False