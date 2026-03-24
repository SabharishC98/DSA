// Last updated: 3/24/2026, 11:26:44 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        boolean ans=true;
        int q=n;
        while(n>0){
            int k=n%2;
            if(n==q){
                if(k==1) ans=false;
                else ans=true;
            }
            else{
                if(ans==false && k==1) return false;
                if(ans==true && k==0) return false;
                if(k==1) ans=false;
                else ans=true;
            }
            n/=2;
        }
        return true;
    }
}