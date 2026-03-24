// Last updated: 3/24/2026, 11:27:19 AM
class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
                if(a>1) return false;
            }
            if(s.charAt(i)=='L'){
                l++;
                if(l==3) return false;
                
            }
            else l=0;
        }
        return true;
    }
}