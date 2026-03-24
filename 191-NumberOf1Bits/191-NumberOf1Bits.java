// Last updated: 3/24/2026, 11:29:40 AM
class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){
            int k=n%2;
            if(k==1) c++;
            n/=2;
        }
        return c;
    }
}