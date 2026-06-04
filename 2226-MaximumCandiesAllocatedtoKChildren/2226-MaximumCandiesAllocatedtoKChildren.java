// Last updated: 6/4/2026, 10:44:48 PM
1class Solution {
2    public int maximumCandies(int[] candies, long k) {
3        long sum=0,maxsofar=0;
4        for(int i:candies){
5            sum+=i;
6            maxsofar=Math.max(maxsofar,i);
7        }
8        if(sum<k) return 0;
9        if(sum==k) return 1;
10        long min=1,max=maxsofar;
11        while(min<max){
12            long mid=min+(max-min+1)/2;
13            if(check(candies,k,mid)) min=mid;
14            else max=mid-1;
15        }
16        return (int)max;
17    }
18    public boolean check(int[] candies,long k,long mid){
19        long possible=0;
20        for(int i:candies){
21            possible+=i/mid;
22            if(possible>=k) return true;
23        }
24        return possible>=k;
25    }
26}