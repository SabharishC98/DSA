// Last updated: 3/24/2026, 11:28:04 AM
class Solution {
    public int countSegments(String ans) {
        String s=ans.trim();
        if(s.length()==0) return 0;
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)==' ') continue;
            if(s.charAt(i)==' ') count++;
        }
        return count;
    }
}