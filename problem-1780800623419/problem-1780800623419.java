// Last updated: 6/7/2026, 8:20:23 AM
1class Solution {
2    public List<String> generateValidStrings(int n, int k) {
3        List<String> ans=new ArrayList<>();
4        back(n,k,ans,new StringBuilder(),0,0);
5        return ans;
6    }
7    public void back(int n,int k,List<String> ans,StringBuilder sb,int index,int cost){
8        if(index==n && cost<=k){
9            ans.add(sb.toString());
10            return;
11        }
12        if(index==n || cost>k) return;
13        for(int i=0;i<=1;i++){
14            if(index!=0 && sb.charAt(index-1)=='1'){
15                sb.append('0');
16                back(n,k,ans,sb,index+1,cost);
17                sb.deleteCharAt(sb.length()-1);
18                break;
19            }
20            if(i==0){
21                sb.append('0');
22                back(n,k,ans,sb,index+1,cost);
23                sb.deleteCharAt(sb.length()-1);
24            }
25            else{
26                sb.append('1');
27                back(n,k,ans,sb,index+1,cost+index);
28                sb.deleteCharAt(sb.length()-1);
29            }
30        }
31    }
32}