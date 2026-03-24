// Last updated: 3/24/2026, 11:22:58 AM
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int x = startPos[0], y = startPos[1];
            int f=0;
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'U')
                    x--;
                else if (ch == 'D')
                    x++;
                else if (ch == 'L')
                    y--;
                else
                    y++;
                if (x > n - 1 || y > n - 1 || x<0 || y<0) {
                    ans[i] = j-i;
                    f=1;
                    break;
                }
            }
            if(f==0) ans[i]=s.length()-i;

        }
        return ans;
    }
}