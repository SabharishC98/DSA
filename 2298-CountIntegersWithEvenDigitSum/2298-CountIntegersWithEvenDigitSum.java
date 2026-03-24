// Last updated: 3/24/2026, 11:22:51 AM
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