// Last updated: 9/25/2026, 2:38:38 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int k=n;
        int p=1;
        int s=0;
        while(n>0){
            int r=n%10;
            p*=r;
            s+=r;
            n/=10;
        }
        return p-s;
    }
}