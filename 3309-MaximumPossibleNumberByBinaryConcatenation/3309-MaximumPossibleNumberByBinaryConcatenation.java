// Last updated: 9/25/2026, 2:26:46 PM
class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] strs=new String[nums.length];
        for(int i=0;i<nums.length;i++) {
            strs[i]=Integer.toBinaryString(nums[i]);
        }
        Arrays.sort(strs,(a,b)->(b + a).compareTo(a+b));
        if(strs[0].equals("0")) return 0;
        StringBuilder sb=new StringBuilder();
        for(String s:strs) sb.append(s);
        return Integer.parseInt(sb.toString(),2);
    }
}