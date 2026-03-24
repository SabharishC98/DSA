// Last updated: 3/24/2026, 11:20:42 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])) l.add(nums[i]);
        }
        Collections.sort(l);
        if(l.size()<k){
            int arr[]=new int[l.size()];
            for(int i=0;i<l.size();i++) arr[l.size()-i-1]=l.get(i);
            return arr;
        }
        else{
            int arr[]=new int[k];
            for(int i=0;i<k;i++) arr[i]=l.get(l.size()-i-1);
            return arr;
        }
    }
}