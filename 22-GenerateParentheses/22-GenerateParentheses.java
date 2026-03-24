// Last updated: 3/24/2026, 11:32:25 AM
class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        back(new StringBuilder(),n,0,0);
        return ans;
    }
    public void back(StringBuilder temp,int max,int o,int c){
        if(temp.length()==max*2){
            ans.add(temp.toString());
            return;
        }
        if(o<max){
            temp.append('(');
            back(temp,max,o+1,c);
            temp.deleteCharAt(temp.length()-1);
        }
        if(c<o){
            temp.append(')');
            back(temp,max,o,c+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}