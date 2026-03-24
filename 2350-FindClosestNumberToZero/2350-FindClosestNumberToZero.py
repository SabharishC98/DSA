# Last updated: 3/24/2026, 11:22:43 AM
class Solution(object):
    def findClosestNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        self.nums=nums
        m=abs(nums[0])
        for i in nums:
            m=min(m,abs(i))
        if m not in nums:
            m=m*-1
        return m