// Last updated: 3/24/2026, 11:27:25 AM
class Solution {
    public int singleNonDuplicate(int[] ans) {
        if(ans.length==1) return ans[0];
        for(int i=0;i<ans.length;i+=2){
            if(i<ans.length-1 && (ans[i]^ans[i+1])!=0) return ans[i];
        }
        return ans[ans.length-1];
    }
}