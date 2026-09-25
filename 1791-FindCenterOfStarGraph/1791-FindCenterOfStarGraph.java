// Last updated: 9/25/2026, 2:35:01 PM
class Solution {
    public int findCenter(int[][] edges) {
        if((edges[0][0]==edges[1][0])||(edges[0][0]==edges[1][1])){
            return edges[0][0];}
        return edges[0][1];
    }

}