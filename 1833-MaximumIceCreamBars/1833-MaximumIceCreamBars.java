// Last updated: 9/25/2026, 2:34:48 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=Integer.MIN_VALUE;
        for(int i:costs){
            max=Math.max(max,i);
        }
        int[] cnt=new int[max+1];
        int[] ans=new int[costs.length];
        for(int i:costs){
            cnt[i]++;
        }
        for(int i=1;i<cnt.length;i++){
            cnt[i]+=cnt[i-1];
        }
        for(int i=costs.length-1;i>=0;i--){
            ans[cnt[costs[i]]-1]=costs[i];
            cnt[costs[i]]--;
        }
        int sum=0,c=0;
        for(int i:ans){
            // System.out.println(i);
            if(i+sum>coins) break;
            sum+=i;
            c++;
        }
        return c;
    }
}