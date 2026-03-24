// Last updated: 3/24/2026, 11:30:08 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            char ch=tokens[i].charAt(0);
            if(ch=='+' && tokens[i].length()==1){
                int ans=st.pop()+st.pop();
                st.push(ans);
            }
            else if(ch=='-' && tokens[i].length()==1){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(ch=='*' && tokens[i].length()==1){
                int ans=st.pop()*st.pop();
                st.push(ans);
            }
            else if(ch=='/' && tokens[i].length()==1){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.pop();
    }
}