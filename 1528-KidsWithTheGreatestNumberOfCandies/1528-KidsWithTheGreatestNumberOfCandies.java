// Last updated: 3/24/2026, 11:24:19 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int max=c[0];
        for(int i=1;i<c.length;i++){
            if(c[i]>max) max=c[i];
        }
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<c.length;i++){
            if(c[i]+e>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}