// Last updated: 3/24/2026, 11:22:46 AM
class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ans=new ArrayList<>();
        int c=s.charAt(1)-48;
        int i=s.charAt(1)-48;
        int j=s.charAt(4)-48;
        char st=(char)(s.charAt(0));
        char end=(char)(s.charAt(3));
        while(st<=end && i<=j){
            String check=String.valueOf((char)st);
            check+=i;
            ans.add(check);
            if(i==j){
                i=c;
                st++;
                continue;
            }
            i++;
        }
        return ans;
    }
}