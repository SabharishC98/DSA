// Last updated: 3/24/2026, 11:24:11 AM
class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum^=(start+2*i);
        }
        return sum;
    }
}