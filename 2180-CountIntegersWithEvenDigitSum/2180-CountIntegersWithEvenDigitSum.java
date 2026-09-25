// Last updated: 9/25/2026, 2:32:33 PM
class Solution {
    public int countEven(int n) {
        int count=0;
        for(int i=2;i<=n;i++){
            int sum = 0;
            int num =i;
            while(num>0){
                int r=num%10;
                sum+=r;
                num/=10;
            }
            if(sum%2==0)
                count++;
        }
        return count;
    }
}