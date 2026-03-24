// Last updated: 3/24/2026, 11:21:17 AM
class Solution {
    public boolean isValid(String word) {
        int l=word.length();
        int s=0,co=0,n=0,v=0;
        for(int i=0;i<l;i++){
            char c=word.charAt(i);
            if(c>=48 && c<=57) n++;
            else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') v++;
            else if(c=='#'  || c=='@' || c=='$') s++;
            else co++;
        }
        return l>=3 && s==0 && v>=1 && co>=1;
    }
}