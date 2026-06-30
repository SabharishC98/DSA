// Last updated: 6/30/2026, 10:08:45 AM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        List<List<Integer>> l=new ArrayList<>();
4        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
5        for(int[] i:intervals){
6            int a=i[0];
7            int b=i[1];
8            if(l.size()!=0 && l.get(l.size()-1).get(1)>=a){
9                l.get(l.size()-1).set(1,Math.max(b,l.get(l.size()-1).get(1)));
10            }
11            else{
12                List<Integer> temp=new ArrayList<>();
13                temp.add(a);
14                temp.add(b);
15                l.add(temp);
16            }
17        }
18        int[][] ans=new int[l.size()][2];
19        for(int i=0;i<l.size();i++){
20            ans[i][0]=l.get(i).get(0);
21            ans[i][1]=l.get(i).get(1);
22        }
23        // System.out.println(l);
24        return ans;
25    }
26}