// Last updated: 3/24/2026, 11:24:17 AM
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> diagonals = new ArrayList<>();
        int total = 0;

        for (int r = 0; r < nums.size(); r++) {
            for (int c = 0; c < nums.get(r).size(); c++) {
                int d = r + c;

                while (diagonals.size() <= d) {
                    diagonals.add(new ArrayList<>());
                }

                // Insert at front to get bottom-to-top order
                diagonals.get(d).add(0, nums.get(r).get(c));
                total++;
            }
        }

        int[] result = new int[total];
        int idx = 0;

        for (List<Integer> diag : diagonals) {
            for (int val : diag) {
                result[idx++] = val;
            }
        }

        return result;
    }
}
