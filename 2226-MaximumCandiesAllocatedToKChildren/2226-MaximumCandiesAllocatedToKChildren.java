// Last updated: 9/25/2026, 2:39:01 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum=0,maxsofar=0;
        for(int i:candies){
            sum+=i;
            maxsofar=Math.max(maxsofar,i);
        }
        if(sum<k) return 0;
        if(sum==k) return 1;
        long min=1,max=maxsofar;
        while(min<max){
            long mid=min+(max-min+1)/2;
            if(check(candies,k,mid)) min=mid;
            else max=mid-1;
        }
        return (int)max;
    }
    public boolean check(int[] candies,long k,long mid){
        long possible=0;
        for(int i:candies){
            possible+=i/mid;
            if(possible>=k) return true;
        }
        return possible>=k;
    }
}