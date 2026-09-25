// Last updated: 9/25/2026, 2:31:03 PM
class Solution {
    public int partitionString(String s) {
        int arr[]=new int[26];
        int c=1;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-97]!=0){
                c++;
                Arrays.fill(arr,0);
            }
            if(arr[s.charAt(i)-97]==0){
                arr[s.charAt(i)-97]++;
            }
        }
        return c;
    }
}