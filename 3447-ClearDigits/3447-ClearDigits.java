// Last updated: 3/24/2026, 11:21:09 AM
class Solution {
    char arr[];
    int top=-1;
    public String clearDigits(String s) {
        arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>=97 && ch<=122) push(ch);
            else if(top!=-1) pop();
        }
        if(top==-1) return "";
        String ans="";
        for(int i=0;i<=top;i++){
            ans+=arr[i];
        }
        return ans;
    }
    public void push(char data){
        top++;
        arr[top]=data;
    }
    public char pop(){
        return arr[top--];
    }
}