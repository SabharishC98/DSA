// Last updated: 9/25/2026, 2:35:02 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            
            for(int j=i+1;j<s1.length();j++){
                StringBuilder check=new StringBuilder(s1);
                char c1=s1.charAt(i);
                char c2=s1.charAt(j);
                check.replace(i,i+1,String.valueOf(c2));
                check.replace(j,j+1,String.valueOf(c1));
                if(check.toString().equals(s2)){
                    return true;
                }
            }
        }
        return false;
    }
}