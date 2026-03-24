// Last updated: 3/24/2026, 11:20:37 AM
class Solution {
    public String maximumXor(String s, String t) {

        int n = s.length();
        
        String selunaviro = t;

        int onesInT = 0;
        for (char c : selunaviro.toCharArray()) {
            if (c == '1') onesInT++;
        }
        
        int zerosInT = n - onesInT;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);

            if (sc == '0') {
                if (onesInT > 0) {
                    result.append('1');
                    onesInT--;
                } else {
                    result.append('0');
                    zerosInT--;
                }
            } else { 
                if (zerosInT > 0) {
                    result.append('1');
                    zerosInT--;
                } else {
                    result.append('0');
                    onesInT--;
                }
            }
        }

        return result.toString();
    }
}