// Last updated: 9/25/2026, 2:39:04 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int c=0,o=0;
        for(int i=0;i<position.length;i++){
            
            if (position[i]%2==0)
            c+=1;
            else
            o+=1;
            
        }
        if (c<o)
        return c;
        return o;
    }
}