// Last updated: 9/25/2026, 2:33:47 PM
class Solution {
    public int maxConsecutiveAnswers(String a, int k) {
        int max=0,l,ct=0,cf=0,si=0;
        for(int li=0;li<a.length();li++){
            if(a.charAt(li)=='T') ct++;
            else cf++;
            while(Math.min(ct,cf)>k){
                if(a.charAt(si)=='T') ct--;
                else cf--;
                si++;
            }
            l=li-si+1;
            if(l>max) max=l;
        }
        return max;
    }
}