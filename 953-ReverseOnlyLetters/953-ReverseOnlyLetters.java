// Last updated: 3/24/2026, 11:25:48 AM
class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder ans=new StringBuilder("");
        int i=0,j=s.length()-1;
        while(i<s.length() && j>=0){
            if(!(s.charAt(j)>=97 && s.charAt(j)<=122 || s.charAt(j)>=65 && s.charAt(j)<=90)){
                j--;
                continue;
            }
            if(!(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=90)){
                ans.append(s.charAt(i));
                i++;
                continue;
            }
            else{
                ans.append(s.charAt(j));
            }
            i++;
            j--;
        }
        while(i<s.length()){
            ans.append(s.charAt(i));
            i++;
        }
        return ans.toString();
    }
}