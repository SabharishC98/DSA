// Last updated: 3/24/2026, 11:28:56 AM
class Solution {
    public int addDigits(int num) {
        int digit,sum=0;
        
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num/10;
            if(num==0 && sum>9){
                 num=sum;
                 sum=0;
        }
        }
        return sum;
    }
}