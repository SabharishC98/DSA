// Last updated: 9/25/2026, 2:25:52 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int s=0,p=1;
        int k=n;
        while(n>0){
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }
        return k%(s+p)==0;
    }
}