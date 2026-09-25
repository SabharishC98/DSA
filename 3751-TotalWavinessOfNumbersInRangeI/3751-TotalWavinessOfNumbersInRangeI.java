// Last updated: 9/25/2026, 2:25:25 PM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++){
            String s=String.valueOf(i);
            if(s.length()==0) continue;
            for(int j=1;j<s.length()-1;j++){
                if(s.charAt(j)<s.charAt(j-1) && s.charAt(j)<s.charAt(j+1)){
                    c++;
                }
                else if(s.charAt(j)>s.charAt(j-1) && s.charAt(j)>s.charAt(j+1)){
                    c++;
                }
            }
        }
        return c;
    }
}