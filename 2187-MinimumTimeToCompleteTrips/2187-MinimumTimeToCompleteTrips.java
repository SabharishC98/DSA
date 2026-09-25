// Last updated: 9/25/2026, 2:32:36 PM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long max=Long.MIN_VALUE,min=1,ans=0L;
        for(int i:time){
            max=Math.max(max,i);
        }
        max*=totalTrips;
        while(min<=max){
            long mid=(min+max)/2;
            if(process(mid,time,totalTrips)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public boolean process(long cur,int[] time,int totalTrips){
        long total=0;
        for(int i:time){
            total+=cur/i;
        }
        return total>=totalTrips;
    }
}