// Last updated: 3/24/2026, 11:29:32 AM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arr1[]=new int[256];
        int arr2[]=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(arr1[ch1]!=arr2[ch2]){
                return false;
            }
            arr1[ch1]=i+1;
            arr2[ch2]=i+1;
        }
        return true;
        
        // int count=1;
        // char arr1[]=s.toCharArray();
        // char arr2[]=t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // char ch=s.charAt(0);
        // for(int i=1;i<s.length();i++){
        //     if(arr1[i]==arr1[i-1]){ 
        //         count++;
        //     }
        // }
        // int count1=1;
        // char ch1=s.charAt(0);
        // for(int i=1;i<t.length();i++){
        //     if(arr2[i]==arr2[i-1]){ 
        //         count1++;
        //     }
        // }
        // return count==count1;
    }
}