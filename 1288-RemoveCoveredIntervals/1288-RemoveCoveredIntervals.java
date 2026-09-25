// Last updated: 9/25/2026, 2:39:34 PM
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        Arrays.sort(intervals,(a,b)-> b[1]-a[1]);
        List<List<Integer>> l=new ArrayList<>();
        for(int[] i:intervals){
            if(l.size()!=0 && l.get(l.size()-1).get(0)<=i[0] && l.get(l.size()-1).get(1)>=i[1])
            continue;
            List<Integer> temp=new ArrayList<>();
            temp.add(i[0]);
            temp.add(i[1]);
            l.add(temp);
        }
        // System.out.println(l);
        // l=check(l);
        return l.size();
    }
    // public List<List<Integer>> check(List<List<Integer>> intervals){
    //     List<List<Integer>> l=new ArrayList<>();
    //     for(List<Integer> i:intervals){
    //         if(l.size()!=0 && l.get(l.size()-1).get(1)>=i.get(0)){
    //             l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),i.get(1)));
    //             continue;
    //         }
    //         List<Integer> temp=new ArrayList<>();
    //         temp.add(i.get(0));
    //         temp.add(i.get(1));
    //         l.add(temp);
    //     }
    //     return l;
    // }
}