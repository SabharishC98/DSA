// Last updated: 3/24/2026, 11:31:29 AM
class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] arr=path.split("/");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("")){
                if(arr[i].equals("..") && !st.isEmpty()){
                    st.pop();
                }
                else if(arr[i].equals(".")) continue;
                else if(!arr[i].equals("..")){
                    st.push(arr[i]);
                }
                
            }
        }
        String ans="";
        if(st.size()==0) return "/";
        
        while(!st.isEmpty()){
            ans="/"+st.pop()+ans;
        }
        
        return ans;
    }
}