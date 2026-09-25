// Last updated: 9/25/2026, 2:39:41 PM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] dif=new int[n];
        int start,en,val;
        for(int i=0;i<bookings.length;i++){
            start=bookings[i][0]-1;
            en=bookings[i][1]-1;
            val=bookings[i][2];
            dif[start]+=val;
            if(en<n-1)
            dif[en+1]-=val;
        }
        int ans[]=new int[n];
        ans[0]=dif[0];
        for(int i=1;i<n;i++) ans[i]=ans[i-1]+dif[i];
        return ans;
    }
}