// Last updated: 9/25/2026, 2:30:23 PM
class Solution {
    public int countDigits(int num) {
        int c=0;
        int k=num;
        while(num>0){
            int r=num%10;
            if(k%r==0) c++;
            num/=10;
        }
        return c;
    }
}