// Last updated: 9/25/2026, 2:38:23 PM
class Solution {
    public int[] sumZero(int n) {
        if(n%2==0){
            int[] arr=new int[n];
            for(int i=1;i<=n/2;i++){
                arr[i-1]=i;
                arr[n/2+i-1]=i*-1;
            }
            return arr;
        }
        else{
            int[] arr=new int[n];
            for(int i=1;i<=n/2;i++){
                arr[i-1]=i;
                arr[n/2+i-1]=i*-1;
            }
            arr[n-1]=0;
            return arr;
        }
    }
}