// Last updated: 9/25/2026, 2:43:47 PM
class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        back(s,new StringBuilder(),0);
        return ans;
    }
    public void back(String s,StringBuilder res,int st){
        if(st==s.length()){
            ans.add(res.toString());
            return;
        }
        char ch=s.charAt(st);
        if(ch>='a' && ch<='z'){
            res.append(ch);
            back(s,res,st+1);
            res.deleteCharAt(res.length()-1);
            res.append((char)(ch-32));
            back(s,res,st+1);
            res.deleteCharAt(res.length()-1);
        }
        else if(ch>='A' && ch<='Z'){
            res.append(ch);
            back(s,res,st+1);
            res.deleteCharAt(res.length()-1);
            res.append((char)(ch+32));
            back(s,res,st+1);
            res.deleteCharAt(res.length()-1);
        }
        else{
             res.append(ch);
            back(s,res,st+1);
            res.deleteCharAt(res.length()-1);
        }
    }
}