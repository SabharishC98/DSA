# Last updated: 3/24/2026, 11:21:57 AM
class Solution(object):
    def countSeniors(self, details):
        """
        :type details: List[str]
        :rtype: int
        """
        self.details=details
        c=0
        for i in details:
            if int(i[-4:-2])>60:
                c+=1 
        return c
        