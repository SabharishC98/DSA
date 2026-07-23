// Last updated: 7/23/2026, 2:18:30 PM
1class Solution {
2    public int findMinMoves(int[] machines) {
3        int sum=0;
4        for(int x:machines)
5            sum+=x;
6        int n=machines.length;
7        if(sum%n!=0)
8            return -1;
9        int target=sum/n;
10        int balance=0;
11        int ans=0;
12        for (int x:machines) {
13            int diff=x-target;
14            balance+=diff;
15            ans=Math.max(ans,Math.max(Math.abs(balance),diff));
16        }
17        return ans;
18    }
19}