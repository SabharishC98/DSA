// Last updated: 9/25/2026, 2:55:23 PM
class Solution {
    public String countAndSay(int n) {
        String s="1";
        if(n==1) return s;
        for(int i=1;i<n;i++){
            s=helper(s);
        }
        return s;
    }
    public String helper(String s){
        StringBuilder ans=new StringBuilder();
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans.append(count+""+s.charAt(i-1));
                count=1;
            }
            else count++;
        }
        ans.append(count+""+s.charAt(s.length()-1));
        return ans.toString();
    }
}