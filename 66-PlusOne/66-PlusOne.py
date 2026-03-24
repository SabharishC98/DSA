# Last updated: 3/24/2026, 11:31:34 AM
class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        k=0
        l=[]
        for i in digits:
            k=k*10+i
        for i in str(k+1):
            l.append(int(i))
        return l