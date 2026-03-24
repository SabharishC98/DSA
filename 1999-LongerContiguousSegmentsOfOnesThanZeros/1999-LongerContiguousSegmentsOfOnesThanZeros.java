// Last updated: 3/24/2026, 11:23:27 AM
class Solution {
    public boolean checkZeroOnes(String s) {
        int c1=0,max1=0;
        int c2=0,max2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c2=0;
                c1++;
                max1=Math.max(max1,c1);
            }
            else{
                c1=0;
                c2++;
                max2=Math.max(max2,c2);
            }
        }
        max1=Math.max(max1,c1);
        max2=Math.max(max2,c2);
        return max1>max2;
    }
}