// Last updated: 9/25/2026, 2:24:56 PM
class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans=new ArrayList<>();
        back(n,k,ans,new StringBuilder(),0,0);
        return ans;
    }
    public void back(int n,int k,List<String> ans,StringBuilder sb,int index,int cost){
        if(index==n && cost<=k){
            ans.add(sb.toString());
            return;
        }
        if(index==n || cost>k) return;
        for(int i=0;i<=1;i++){
            if(index!=0 && sb.charAt(index-1)=='1'){
                sb.append('0');
                back(n,k,ans,sb,index+1,cost);
                sb.deleteCharAt(sb.length()-1);
                break;
            }
            if(i==0){
                sb.append('0');
                back(n,k,ans,sb,index+1,cost);
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append('1');
                back(n,k,ans,sb,index+1,cost+index);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}