// Last updated: 4/29/2026, 12:01:09 AM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        List<Integer> temp=new ArrayList<>();
4        for(int i[]: grid){
5            for(int j:i){
6                temp.add(j);
7            }
8        }
9        Collections.sort(temp);
10        int count=0;
11        int median=temp.get(temp.size()/2);
12        for(int i:temp){
13            int diff=Math.abs(i-median);
14            if(diff%x!=0) return -1;
15            count+=diff/x;
16        }
17        return count;
18    }
19}