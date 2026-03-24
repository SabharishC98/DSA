// Last updated: 3/24/2026, 11:29:20 AM
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        back(k,n,new ArrayList<>(),1);
        return ans;
    }
    public void back(int k,int n,List<Integer> temp,int st){
        if(n<0) return;
        if(temp.size()==k && n==0){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=st;i<=9;i++){
            if(i>n) break;
            temp.add(i);
            back(k,n-i,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}