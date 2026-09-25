// Last updated: 9/25/2026, 2:38:10 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=1;i<n;i++){
            int a=i;
            int b=n-i;
            boolean zero=false;
            while(a>0){
                if(a%10==0){
                    zero=true;
                    break;
                }
                a/=10;
            }
            if(zero) continue;
            while(b>0){
                if(b%10==0){
                    zero=true;
                    break;
                }
                b/=10;
            }
            if(zero) continue;
            arr[0]=i;arr[1]=n-i;
            break;
        }
        return arr;
    }
}