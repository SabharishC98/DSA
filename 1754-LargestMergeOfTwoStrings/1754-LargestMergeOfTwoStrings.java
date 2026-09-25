// Last updated: 9/25/2026, 2:35:20 PM
class Solution {
    public String largestMerge(String word1, String word2) {
        int i=0,j=0;
        StringBuilder sb=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);
            if(ch1>ch2){
                sb.append(ch1);
                i++;
            }
            else if(ch2>ch1){
                sb.append(ch2);
                j++;
            }
            else{
                if(word1.substring(i).compareTo(word2.substring(j))>=0){
                    sb.append(ch1);
                    i++;
                }
                else{
                    sb.append(ch2);
                    j++;
                }
            }
        }
        while(i<word1.length()) sb.append(word1.charAt(i++));
        while(j<word2.length()) sb.append(word2.charAt(j++));
        return sb.toString();
    }
}