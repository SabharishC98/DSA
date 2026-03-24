// Last updated: 3/24/2026, 11:20:51 AM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n1[]=new int[fruits.length];
        int n2[]=new int[baskets.length];
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(n2[j]==0 && fruits[i]<=baskets[j]){
                    n1[i]++;
                    n2[j]++;
                    break;
                }
            }
        }
        int c=0;
        for(int i=0;i<n1.length;i++){
            if(n1[i]==0) c++;
        }
        return c;
    }
}