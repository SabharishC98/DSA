// Last updated: 3/24/2026, 11:25:07 AM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int dif[]=new int[10001];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<trips.length;i++){
            int val=trips[i][0];
            dif[trips[i][1]]+=val;
            max=Math.max(max,trips[i][2]);
            if(trips[i][2]<dif.length-1)
            dif[trips[i][2]]-=val;
        }
        if(dif[0]>capacity) return false;
        for(int i=1;i<max;i++){ 
            dif[i]+=dif[i-1]; 
            if(dif[i]>capacity) return false;
        }
        return true;
    }
}