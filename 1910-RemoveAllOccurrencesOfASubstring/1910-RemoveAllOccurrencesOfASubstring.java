// Last updated: 9/25/2026, 2:34:21 PM
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        
        int idx = sb.indexOf(part);
        while (idx != -1) {
            sb.delete(idx, idx + part.length()); 
            idx = sb.indexOf(part); 
        }
        
        return sb.toString();
    }
}
