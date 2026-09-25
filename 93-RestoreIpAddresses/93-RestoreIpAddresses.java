// Last updated: 9/25/2026, 2:53:39 PM
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=new ArrayList<>();
        if(s.length()<4 || s.length()>12) return ans;
        back(s,ans,0,new ArrayList<>());
        return ans;
    }
    public void back(String s,List<String> ans,int index,List<String> temp){
        if(temp.size()==4 && index==s.length()){
            ans.add(String.join(".",temp));
            return;
        }
        if(temp.size()==4 || index==s.length()){
            return;
        }
        for(int len=1;len<=3;len++){
            if(index+len>s.length()){
                break;
            }
            String seg=s.substring(index,index+len);
            if(!valid(seg)) continue;
            temp.add(seg);
            back(s,ans,index+len,temp);
            temp.remove(temp.size()-1);
        }
    }
    public boolean valid(String s){
        if(s.length()>1 && s.charAt(0)=='0') return false;
        int value=Integer.parseInt(s);
        return value>=0 && value<=255;
    }
}