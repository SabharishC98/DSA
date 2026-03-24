// Last updated: 3/24/2026, 11:21:29 AM
class Solution {
    public List<Integer> findPeaks(int[] a) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<a.length-1;i++){
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}