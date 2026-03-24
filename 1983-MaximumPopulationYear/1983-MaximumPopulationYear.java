// Last updated: 3/24/2026, 11:23:32 AM
class Solution {
    public int maximumPopulation(int[][] logs) {
        int dif[]=new int[101];
        for(int i=0;i<logs.length;i++){
            int st=logs[i][0]-1950;
            int end=logs[i][1]-1950;
            dif[st]+=1;
            if(end<100) dif[end]-=1;
        }
        int max=dif[0],ans=0;
        for(int i=1;i<dif.length;i++){
            dif[i]+=dif[i-1];
            if(dif[i]>max){
                max=dif[i];
                ans=i;
            }
        }
        return ans+1950;
    }
}