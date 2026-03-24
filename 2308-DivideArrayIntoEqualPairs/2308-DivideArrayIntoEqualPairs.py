# Last updated: 3/24/2026, 11:22:49 AM
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