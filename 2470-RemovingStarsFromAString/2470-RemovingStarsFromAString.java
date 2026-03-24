// Last updated: 3/24/2026, 11:22:24 AM
class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && !st.isEmpty()) st.pop();
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());
        ans.reverse();
        return ans.toString();
    }
}