// Last updated: 3/24/2026, 11:32:19 AM
class Solution {
    public int strStr(String hay, String nee) {
        int n=0,index=0;
        for(int i=0;i<hay.length();i++){
            if(hay.charAt(i)==nee.charAt(n)){
                if(n==0){
                    index=i;
                }
                if(n==nee.length()-1){
                    return index;
                }
                n++;
            }
            else{
                i-=n;
                n=0;
            }
        }
        return -1;
    }
}