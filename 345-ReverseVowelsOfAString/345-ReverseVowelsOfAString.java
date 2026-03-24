// Last updated: 3/24/2026, 11:28:23 AM
class Solution {
    public String reverseVowels(String s) {
       String an="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')  {
            an+=ch;
        }
       } 
       int j=an.length()-1;
       String ans="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')  {
            ans+=an.charAt(j--);
        }
        else ans+=ch;
       }
       return ans;
    }
}