# Last updated: 3/24/2026, 11:29:12 AM
class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        if len(nums)==0:
            return nums
        l=[]
        start=nums[0]
        end=start
        for i in range(1,len(nums)):
            if end+1!=nums[i]:
                if start != end:
                    l.append(str(start)+"->"+str(end))
                else:
                    l.append(str(start))
                end=nums[i]
                start=nums[i]
            else:
                end=nums[i]
        if start==end:
            l.append(str(start))
        else:
            l.append(str(start)+"->"+str(end))
        return l


            


        