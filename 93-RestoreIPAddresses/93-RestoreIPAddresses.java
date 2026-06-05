// Last updated: 6/5/2026, 11:07:30 AM
1class Solution {
2    public List<String> restoreIpAddresses(String s) {
3        List<String> ans=new ArrayList<>();
4        if(s.length()<4 || s.length()>12) return ans;
5        back(s,ans,0,new ArrayList<>());
6        return ans;
7    }
8    public void back(String s,List<String> ans,int index,List<String> temp){
9        if(temp.size()==4 && index==s.length()){
10            ans.add(String.join(".",temp));
11            return;
12        }
13        if(temp.size()==4 || index==s.length()){
14            return;
15        }
16        for(int len=1;len<=3;len++){
17            if(index+len>s.length()){
18                break;
19            }
20            String seg=s.substring(index,index+len);
21            if(!valid(seg)) continue;
22            temp.add(seg);
23            back(s,ans,index+len,temp);
24            temp.remove(temp.size()-1);
25        }
26    }
27    public boolean valid(String s){
28        if(s.length()>1 && s.charAt(0)=='0') return false;
29        int value=Integer.parseInt(s);
30        return value>=0 && value<=255;
31    }
32}