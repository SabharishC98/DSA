# Last updated: 3/24/2026, 11:32:08 AM
class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        l=[]
        for i in nums:
            if i>0:
                l.append(i)
        nums=l
        if len(nums)==0 or min(nums)!=1:
            return 1
        else:
            for i in range(1,len(nums)):
                if nums[i]==nums[i-1]:
                    continue
                if nums[i]!=nums[i-1]+1:
                    return nums[i-1]+1
        return nums[-1]+1