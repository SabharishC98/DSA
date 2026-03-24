// Last updated: 3/24/2026, 11:29:54 AM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;
            int r=n%26;
            ans.append((char)(r+'A'));
            n/=26;
        }
        return ans.reverse().toString();
    }
}