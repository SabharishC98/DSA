// Last updated: 3/24/2026, 11:28:55 AM
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        ArrayList <Integer>list=new ArrayList<>();
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
                i++;
            }
            else{
                i+=2;
            }
        }
        if(i==nums.length-1 && nums[i]!=nums[i-1]){
            list.add(nums[i]);
        }
        int[]arr = new int [list.size()];
        for(i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}