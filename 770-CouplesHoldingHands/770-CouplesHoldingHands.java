// Last updated: 3/24/2026, 11:26:25 AM
class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            pos[row[i]]=i;
        }
        int ans=0;
        for(int i=0;i<n;i+=2){
            int first=row[i];
            int expected=first^1;
            if(row[i+1]!=expected){
                ans++;
                int pp=pos[expected];
                pos[row[i+1]]=pp;
                pos[expected]=i+1;
                int t=row[i+1];
                row[i+1]=row[pp];
                row[pp]=t;
            }
        }
        return ans;
    }
}