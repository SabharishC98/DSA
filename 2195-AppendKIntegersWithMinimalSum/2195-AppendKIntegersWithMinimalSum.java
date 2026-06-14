// Last updated: 6/14/2026, 9:17:24 AM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        Arrays.sort(nums);
4        long res=(long)k*(k+1)/2;
5        int prev=-1;
6        for(int n:nums){
7            if(n==prev) continue;
8            prev=n;
9            if(n<=k){
10                res+=(++k)-n;
11            }
12            else{
13                break;
14            }
15        }
16        return res;
17    }
18}