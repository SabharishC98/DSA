// Last updated: 3/24/2026, 11:22:06 AM
class Solution {
    public int alternateDigitSum(int n) {
        int s=0;
        String st=String.valueOf(n);
        int sign;
        if(st.length()%2==0){
            sign=1;
        }
        else{
            sign=0;
        }
        while(n>0){
            if(sign==1){
                s-=(n%10);
                sign=0;
            }
            else{
                s+=(n%10);
                sign=1;
            }
            n/=10;
        }
        return s;
    }
}