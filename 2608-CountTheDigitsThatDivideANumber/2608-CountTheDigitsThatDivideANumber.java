// Last updated: 3/24/2026, 11:22:10 AM
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