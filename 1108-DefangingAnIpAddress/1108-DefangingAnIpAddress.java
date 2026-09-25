// Last updated: 9/25/2026, 2:39:46 PM
class Solution {
    public String defangIPaddr(String a) {
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.') s.append("[.]");
            else s.append(a.charAt(i));
        }
        return s.toString();
    }
}