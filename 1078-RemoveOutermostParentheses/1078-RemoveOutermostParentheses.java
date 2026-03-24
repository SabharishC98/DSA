// Last updated: 3/24/2026, 11:25:19 AM
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' && c==0){
                c++;
            }
            else if(c==1 && ch==')'){
                c--;
            }
            else if(ch=='('){
                ans.append(ch); c++;
            }
            else{
                ans.append(ch); c--;
            }
            
        }
        return ans.toString();
    }
}