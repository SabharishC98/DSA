# Last updated: 3/24/2026, 11:25:30 AM
class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        s=0
        for i in num:
            s=s*10+i
        s+=k
        l=[]
        while(s>0):
            l.append(s%10)
            s//=10
        return l[::-1]
        