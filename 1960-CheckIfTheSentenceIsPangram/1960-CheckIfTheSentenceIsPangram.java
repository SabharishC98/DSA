// Last updated: 3/24/2026, 11:23:35 AM
class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length()<26) return false;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++) if(arr[i]==0) return false;
        return true;
    }
}