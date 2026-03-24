// Last updated: 3/24/2026, 11:21:24 AM
class Solution {
    public int countKeyChanges(String s) {
        String k=s.toLowerCase();
        int c=0;
        for(int i=0;i<s.length()-1;i++){
            if(k.charAt(i)!=k.charAt(i+1)) c++;
        }
        return c;
    }
}