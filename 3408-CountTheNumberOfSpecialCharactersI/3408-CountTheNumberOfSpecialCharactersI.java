// Last updated: 3/24/2026, 11:21:15 AM
class Solution {
    public int numberOfSpecialChars(String s) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=91) arr1[ch-65]++;
            else arr2[ch-97]++;
        }
        int c=0;
        for(int i=25;i>=0;i--){
            if(arr1[i]!=0 && arr2[i]!=0){c++;}
        }
        return c;
    }
}