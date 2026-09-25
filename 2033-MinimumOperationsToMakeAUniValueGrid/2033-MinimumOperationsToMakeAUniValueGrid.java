// Last updated: 9/25/2026, 2:33:35 PM
class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> temp=new ArrayList<>();
        for(int i[]: grid){
            for(int j:i){
                temp.add(j);
            }
        }
        Collections.sort(temp);
        int count=0;
        int median=temp.get(temp.size()/2);
        for(int i:temp){
            int diff=Math.abs(i-median);
            if(diff%x!=0) return -1;
            count+=diff/x;
        }
        return count;
    }
}