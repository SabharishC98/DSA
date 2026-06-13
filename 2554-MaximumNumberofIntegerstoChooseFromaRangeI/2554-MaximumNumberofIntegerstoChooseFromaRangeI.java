// Last updated: 6/13/2026, 1:47:28 PM
1class Solution {
2    public int maxCount(int[] banned, int n, int maxSum) {
3        Map<Integer,Boolean> set=new HashMap<>();
4        int index=0;
5        int ans=0;
6        for(int i:banned) set.put(i,true);
7        // System.out.println();
8        for(int i=1;i<=n;i++){
9            if(set.containsKey(i)){
10                // System.out.println(banned[index]+" out");
11                index++;
12                continue;
13            }
14            if(maxSum-i<0) break;
15            
16            ans++;
17            maxSum-=i;
18            // System.out.println(ans+" "+i+" "+maxSum);
19        }
20
21        return ans;
22    }
23
24    
25}