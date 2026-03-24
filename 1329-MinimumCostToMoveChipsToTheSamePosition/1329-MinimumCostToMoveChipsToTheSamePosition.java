// Last updated: 3/24/2026, 11:24:50 AM
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