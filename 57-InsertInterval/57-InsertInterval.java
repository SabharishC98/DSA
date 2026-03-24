// Last updated: 3/24/2026, 11:31:43 AM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] n=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            n[i]=intervals[i];
        }
        n[intervals.length]=newInterval;
        Arrays.sort(n,(a,b)->a[0]-b[0]);
        List<int[]> l=new ArrayList<>();
        for(int i[]:n){
            if(l.size()==0 || l.get(l.size()-1)[1]<i[0]) l.add(i);
            else l.get(l.size()-1)[1]=Math.max(l.get(l.size()-1)[1],i[1]);
        }
        int[][] ans=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            ans[i][0]=l.get(i)[0];
            ans[i][1]=l.get(i)[1];
        }
        return ans;
    }
}