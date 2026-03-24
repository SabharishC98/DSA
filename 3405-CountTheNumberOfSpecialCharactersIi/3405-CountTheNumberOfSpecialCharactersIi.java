// Last updated: 3/24/2026, 11:21:16 AM
class Solution {
    public int numberOfSpecialChars(String s) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        int index[]=new int[26];
        int index1[]=new int[26];
        for(int i=25;i>=0;i--){
            index[i]=-1;
            index1[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=65 && ch<=91){ arr1[ch-65]++;
            if(index[ch-65]==-1) index[ch-65]=i;
            }
            else{ arr2[ch-97]++; index1[ch-97]=i;}
        }
        int c=0;
        for(int i=25;i>=0;i--){
            if(arr1[i]!=0 && arr2[i]!=0 && index[i]>index1[i]){c++;}
        }
        return c;
    }
}