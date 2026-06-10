// Last updated: 6/10/2026, 9:40:24 AM
1class Solution {
2    public String getPermutation(int n, int k) {
3        List<Integer> list=new ArrayList<>();
4        k--;
5        for(int i=1;i<=n;i++) list.add(i);
6        StringBuilder sb=new StringBuilder();
7        int f=fact(list.size()-1);
8        while(list.size()>1){
9            int cur=k/f;
10            k=k%f;
11            f=f/(list.size()-1);
12            // System.out.println(f+" "+cur+" "+k);
13            sb.append(list.get(cur));
14            list.remove(cur);
15        }
16        sb.append(list.get(0));
17        return sb.toString();
18    }
19    public int fact(int k){
20        if(k==1 || k==0) return 1;
21        int ans=1;
22        while(k>1){
23            ans*=k;
24            k--;
25        }
26        return ans;
27    }
28}