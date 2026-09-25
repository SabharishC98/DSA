// Last updated: 9/25/2026, 2:48:37 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        if(n==1) return 10;
        int ans=9;
        for(int i=9;i>=11-n;i--){
            ans*=i;
        }
        return ans+countNumbersWithUniqueDigits(n-1);
    }
}