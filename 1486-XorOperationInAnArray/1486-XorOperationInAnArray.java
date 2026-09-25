// Last updated: 9/25/2026, 2:36:53 PM
class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum^=(start+2*i);
        }
        return sum;
    }
}