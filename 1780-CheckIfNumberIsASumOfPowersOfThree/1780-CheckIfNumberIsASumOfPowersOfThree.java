// Last updated: 9/25/2026, 2:35:14 PM
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2) return false;
            n/=3;
        }
        return true;
    }
}