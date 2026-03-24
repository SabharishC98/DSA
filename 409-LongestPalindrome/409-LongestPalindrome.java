// Last updated: 3/24/2026, 11:28:12 AM
class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int[53];
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=97 && c<=122){
                arr[c-71]+=1;
            }
            else{
                arr[c-65]+=1;
            }
        }
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) count+=arr[i];
            else{
                check=false;
                count+=arr[i]-1;
            }
        }
        return check?count:count+1;
    }
}