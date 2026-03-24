// Last updated: 3/24/2026, 11:31:56 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        subset(result, x, nums);
        return result;
    }

    public static void subset(List<List<Integer>> result, List<Integer> current, int[] arr) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if ((current.contains(arr[i]))) {
                    continue;
                }
                current.add(arr[i]);
                subset(result, current, arr);
                current.remove(current.size() - 1);
            }
        }
    }
}