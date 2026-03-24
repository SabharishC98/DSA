// Last updated: 3/24/2026, 11:25:27 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in=new int[n+1];
        int[] out=new int[n+1];
        if(n==1) return 1;
        for(int[] i:trust){
            out[i[0]]++;
            in[i[1]]++;
        }
        for(int i=0;i<=n;i++){
            if(in[i]==n-1 && out[i]==0) return i;
        }

        return -1;
    }
}