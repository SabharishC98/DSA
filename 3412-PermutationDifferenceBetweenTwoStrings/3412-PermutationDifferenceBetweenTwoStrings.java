// Last updated: 3/24/2026, 11:21:14 AM
class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s.length();i++){
            if(arr1[s.charAt(i)-97]==0){
                arr1[s.charAt(i)-97]=i+1;
            }
        }
        for(int i=0;i<t.length();i++){
            if(arr2[t.charAt(i)-97]==0){
                arr2[t.charAt(i)-97]=i+1;
            }
        }
        int sum=0;
        for(int i=0;i<26;i++){
            sum+=Math.abs(arr1[i]-arr2[i]);
        }
        return sum;
    }
}