// Last updated: 9/25/2026, 2:27:15 PM
class Solution {
    public int countDays(int days, int[][] intervals) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        for(int[] i:intervals){
            int a=i[0];
            int b=i[1];
            if(l.size()!=0 && l.get(l.size()-1).get(1)>=a){
                l.get(l.size()-1).set(1,Math.max(b,l.get(l.size()-1).get(1)));
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(a);
                temp.add(b);
                l.add(temp);
            }
        }
        int ans=l.get(0).get(0)-1;
        for(int i=0;i<l.size()-1;i++){
            ans+=l.get(i+1).get(0)-l.get(i).get(1)-1;
        }
        ans+=days-l.get(l.size()-1).get(1);
        return ans;
    }
}