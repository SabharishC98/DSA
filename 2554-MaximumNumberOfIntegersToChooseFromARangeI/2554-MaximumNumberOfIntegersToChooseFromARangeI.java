// Last updated: 9/25/2026, 2:30:08 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Map<Integer,Boolean> set=new HashMap<>();
        int index=0;
        int ans=0;
        for(int i:banned) set.put(i,true);
        // System.out.println();
        for(int i=1;i<=n;i++){
            if(set.containsKey(i)){
                // System.out.println(banned[index]+" out");
                index++;
                continue;
            }
            if(maxSum-i<0) break;
            
            ans++;
            maxSum-=i;
            // System.out.println(ans+" "+i+" "+maxSum);
        }

        return ans;
    }

    
}