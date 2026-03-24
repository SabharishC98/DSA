# Last updated: 3/24/2026, 11:23:44 AM
class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        self.word1=word1
        self.word2=word2
        s=""
        n1=len(word1)
        n2=len(word2)
        while True:
            s+=word1[len(word1)-n1]+word2[len(word2)-n2]
            n1-=1
            n2-=1
            if n1==0 or n2==0:
                break
        if n1!=0:
            s+=word1[len(word1)-n1:]
        else:
            s+=word2[len(word2)-n2:]
        return s

        