// Last updated: 7/23/2026, 2:42:16 PM
1class Solution {
2    public int integerReplacement(int n) {
3        if(n==1) return 0;
4        Queue<long[]> q=new LinkedList<>();
5        q.add(new long[]{n,0});
6        while(!q.isEmpty()){
7            long[] p=q.poll();
8            if(p[0]%2==0){
9                q.add(new long[]{p[0]/2,p[1]+1});
10                if(p[0]/2==1) return (int)p[1]+1;
11            }
12            else{
13                q.add(new long[]{p[0]-1,p[1]+1});
14                if(p[0]-1==1) return (int)p[1]+1;
15                q.add(new long[]{p[0]+1,p[1]+1});
16                if(p[0]+1==1) return (int)p[1]+1;
17            }
18        }
19        return 0;
20    }
21}