// Last updated: 7/28/2026, 3:53:26 PM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        int sum=0;
4        int i=0,j=0;
5        int[] arr=new int[10001];
6        int max=0;
7        while(j<nums.length){
8            sum+=nums[j];
9            arr[nums[j]]++;
10            while(i<nums.length && arr[nums[j]]>1){
11                arr[nums[i]]--;
12                sum-=nums[i];
13                i++;
14            }
15            max=Math.max(max,sum);
16            j++;
17        }
18        return max;
19    }
20}