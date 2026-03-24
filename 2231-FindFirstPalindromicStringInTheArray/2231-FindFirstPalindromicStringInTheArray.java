// Last updated: 3/24/2026, 11:23:03 AM
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int k=0,j=words[i].length()-1,f=0;
            while(k<j){
                if(words[i].charAt(j)!=words[i].charAt(k)){
                    f=1;
                    break;
                }
                k++;
                j--;
            }
            if(f==0) return words[i];
        }
        return "";
    }
}