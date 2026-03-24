// Last updated: 3/24/2026, 11:20:44 AM
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