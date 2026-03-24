// Last updated: 3/24/2026, 11:24:18 AM
class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0,max=0;
        for(int i=0;i<k;i++){
            sum+=c[i];
        }
        max=sum;
        for(int i=0;i<k;i++){
            sum=sum+c[c.length-i-1]-c[k-i-1];
            if(sum>max) max=sum;
        }
        return max;
    }
} 