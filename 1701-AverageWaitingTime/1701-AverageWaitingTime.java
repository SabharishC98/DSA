// Last updated: 9/25/2026, 2:35:51 PM
class Solution {
    public double averageWaitingTime(int[][] customers) {
        long wait=0;
        long chef=0;
        for(int[] i:customers){
            chef=Math.max(chef,i[0])+i[1];
            wait+=chef-i[0];
        }
        return (double)wait/customers.length;
    }
}