// Last updated: 3/24/2026, 11:23:12 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') x++;
            else x--;
        }
        return x;
    }
}
