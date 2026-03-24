// Last updated: 3/24/2026, 11:28:03 AM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        if(n==0) return 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int last=intervals[0][1],c=1;
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=last){
                c++;
                last=intervals[i][1];
            }
        }
        return n-c;
    }
}