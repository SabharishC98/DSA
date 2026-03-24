// Last updated: 3/24/2026, 11:22:03 AM
class Solution {
    public int[] evenOddBit(int num) {
        String binary = "";
        
        int n = num;
        while (n > 0) {
            binary =binary + (n % 2) ;
            n = n / 2;
        }
        int o=0,e=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                if(i%2==0) e++;
                else o++;
            }
        }
        int arr[]=new int[2];
        arr[0]=e;
        arr[1]=o;
        return arr;
    }
}