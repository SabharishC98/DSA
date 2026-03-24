// Last updated: 3/24/2026, 11:25:04 AM
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