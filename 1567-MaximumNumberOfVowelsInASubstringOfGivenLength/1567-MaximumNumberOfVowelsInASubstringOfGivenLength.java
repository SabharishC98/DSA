// Last updated: 3/24/2026, 11:24:14 AM
class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c++;
        }
        int max=c;
        for(int i=1;i<s.length()-k+1;i++){
            char ch=s.charAt(i+k-1);
            char ch1=s.charAt(i-1);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') c--;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c++;
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}