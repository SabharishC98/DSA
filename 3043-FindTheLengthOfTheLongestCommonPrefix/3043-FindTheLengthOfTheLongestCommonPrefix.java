// Last updated: 9/25/2026, 2:27:52 PM
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int i:arr1){
            while(i>0){
                set.add(i);
                i/=10;
            }
        }
        for(int i:arr2){
            while(i>0){
            if(String.valueOf(i).length()<=max) break;
            if(set.contains(i)){
                max=Math.max(max,String.valueOf(i).length());
                break;
            }
            i/=10;
            }
        }
        return max;
    }
}