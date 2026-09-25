// Last updated: 9/25/2026, 2:37:18 PM
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