// Last updated: 6/22/2026, 9:16:07 AM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        int max=Integer.MIN_VALUE;
4        for(int i:costs){
5            max=Math.max(max,i);
6        }
7        int[] cnt=new int[max+1];
8        int[] ans=new int[costs.length];
9        for(int i:costs){
10            cnt[i]++;
11        }
12        for(int i=1;i<cnt.length;i++){
13            cnt[i]+=cnt[i-1];
14        }
15        for(int i=costs.length-1;i>=0;i--){
16            ans[cnt[costs[i]]-1]=costs[i];
17            cnt[costs[i]]--;
18        }
19        int sum=0,c=0;
20        for(int i:ans){
21            // System.out.println(i);
22            if(i+sum>coins) break;
23            sum+=i;
24            c++;
25        }
26        return c;
27    }
28}