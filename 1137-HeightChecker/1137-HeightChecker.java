// Last updated: 3/24/2026, 11:25:11 AM
class Solution {
    public int heightChecker(int[] h) {
        int[] ex=new int[h.length];
        int c=0;
        for(int i=0;i<h.length;i++){
            ex[i]=h[i];
        }
        Arrays.sort(ex);
        for(int i=0;i<h.length;i++){
            if(ex[i]!=h[i]) c++;
        }
        return c;
    }
}