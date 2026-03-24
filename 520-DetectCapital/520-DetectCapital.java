// Last updated: 3/24/2026, 11:27:30 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0,g=0,i=0,j=word.length()-1;
        while(i<=j){
            if((word.charAt(i)>=65 && word.charAt(i)<=90)){
            c++;
            if(i==j) break;
            if(i==0) g=1;
            } 
            if((word.charAt(j)>=65 && word.charAt(j)<=90)) c++;
            i++;
            j--;
        }
        
        if(c==word.length() || c==0 || (c==1 && g==1)) return true;
        return false;
    }
}