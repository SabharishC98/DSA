// Last updated: 8/14/2026, 8:33:28 PM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        long max=Long.MIN_VALUE,min=1,ans=0L;
4        for(int i:time){
5            max=Math.max(max,i);
6        }
7        max*=totalTrips;
8        while(min<=max){
9            long mid=(min+max)/2;
10            if(process(mid,time,totalTrips)){
11                ans=mid;
12                max=mid-1;
13            }
14            else{
15                min=mid+1;
16            }
17        }
18        return ans;
19    }
20    public boolean process(long cur,int[] time,int totalTrips){
21        long total=0;
22        for(int i:time){
23            total+=cur/i;
24        }
25        return total>=totalTrips;
26    }
27}