# Last updated: 3/24/2026, 11:32:35 AM
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        m=strs[0]
        for i in strs:
            if len(i)<len(m):
                m=i
        ans=""
        i=0
        while i<len(m):
            for j in strs:
                if j[i]!=m[i]:
                    return ans
            ans+=m[i]
            i+=1
        return ans
        
        