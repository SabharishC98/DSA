// Last updated: 3/24/2026, 11:31:22 AM
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        back(new ArrayList<>(),1,k,n);
        return ans;
    }

    public void back(List<Integer> temp,int i,int k,int n){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<=n;j++){
            temp.add(j);
            back(temp,j+1,k,n);
            temp.remove(temp.size()-1);
        }
    }
}