// Last updated: 3/24/2026, 11:31:35 AM
class Solution {
    public boolean isNumber(String s) {
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                numSeen = true;
                numAfterE = true;

            } else if (c == '.') {
                if (dotSeen || eSeen) return false;
                dotSeen = true;

            } else if (c == 'e' || c == 'E') {
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numAfterE = false; // reset — need digit after e

            } else if (c == '+' || c == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }

            } else {
                return false; // any other char is invalid
            }
        }

        return numSeen && numAfterE;
    }
}