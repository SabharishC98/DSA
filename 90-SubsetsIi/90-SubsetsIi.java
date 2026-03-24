// Last updated: 3/24/2026, 11:31:09 AM

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int j = 0;
        List<Integer> x = new ArrayList<>();
        Set<String> set=new HashSet<>();
        subset(result, x, nums, j,set);
        return result;
    }

    public static void subset(List<List<Integer>> result, List<Integer> current, int[] arr, int j,Set<String> set) {
        if(!set.contains(String.valueOf(new ArrayList<>(current)))){
            set.add(String.valueOf(new ArrayList<>(current)));
        result.add(new ArrayList<>(current));
        }
        for (int i = j; i < arr.length; i++) {
            current.add(arr[i]);
            subset(result, current, arr, i + 1,set);
            current.remove(current.size()-1);
        }
    }
}