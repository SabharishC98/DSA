// Last updated: 3/24/2026, 11:25:12 AM
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(st.peek()==s.charAt(i)){
                    st.pop();
                }
                else st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();;
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
    ans.reverse();
        return ans.toString();
    }
}