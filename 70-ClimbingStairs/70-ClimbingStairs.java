// Last updated: 3/24/2026, 11:31:30 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=1)
        return n;
        int a=1,b=1;
        for(int i=2;i<=n;i++){
            int t=a;
            a+=b;
            b=t;
        }
        return a;

        
    }
}