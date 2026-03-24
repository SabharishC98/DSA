// Last updated: 3/24/2026, 11:26:53 AM
class Solution {
    public int countSubstrings(String str) {
        int i=0,j=0,c=0;
        while(i<str.length() && j<str.length()){
            if(pal(str.substring(i,j+1))){
                c++;
            }
            
            if(j==str.length()-1){
                i++;
                j=i;
            }
            else
            j++;
        }
        return c;
    }
    public static Boolean pal(String s){
        int i=0,j=s.length()-1;
        if(s.length()==1){
            return true;
        }
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    }
