# Last updated: 9/25/2026, 2:32:25 PM
class Solution(object):
    def divideArray(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        l=set(nums)
        for i in l:
            if nums.count(i)%2!=0:
                return False
        return True