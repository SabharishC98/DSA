// Last updated: 3/24/2026, 11:28:15 AM
class Solution {
    public char findTheDifference(String s, String t) {
        int arr1[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr1[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            arr1[t.charAt(i)-97]--;
        }
        char ans=' ';
        for(int i=0;i<26;i++){
            if(arr1[i]!=0){
                ans=(char)(i+97);
                break;
            }
        }
        return ans;
    }
}