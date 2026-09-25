# Last updated: 9/25/2026, 2:29:39 PM
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
        