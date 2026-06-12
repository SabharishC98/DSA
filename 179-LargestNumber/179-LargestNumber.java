// Last updated: 6/12/2026, 6:18:55 AM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] strs=new String[nums.length];
4        for(int i=0;i<nums.length;i++) {
5            strs[i]=String.valueOf(nums[i]);
6        }
7        Arrays.sort(strs,(a,b)->(b + a).compareTo(a+b));
8        if(strs[0].equals("0")) return "0";
9        StringBuilder sb=new StringBuilder();
10        for(String s:strs) sb.append(s);
11        return sb.toString();
12    }
13}