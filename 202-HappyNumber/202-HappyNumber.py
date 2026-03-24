# Last updated: 3/24/2026, 11:29:35 AM
class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        k=n
        l=[]
        self.n=n
        while(n!=1):
            m=0
            l.append(n)
            while int(k)>0:
                m+=(k%10)**2
                k//=10
            k=m
            n=m
            if n in l:
                n=0
                break
        if n==1:
            return True
        return False