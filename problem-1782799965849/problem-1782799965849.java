// Last updated: 6/30/2026, 11:42:45 AM
1class Solution {
2    public int countDays(int days, int[][] intervals) {
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
18        int ans=l.get(0).get(0)-1;
19        for(int i=0;i<l.size()-1;i++){
20            ans+=l.get(i+1).get(0)-l.get(i).get(1)-1;
21        }
22        ans+=days-l.get(l.size()-1).get(1);
23        return ans;
24    }
25}