// Last updated: 6/12/2026, 5:53:29 AM
1class Solution {
2    public double averageWaitingTime(int[][] customers) {
3        long wait=0;
4        long chef=0;
5        for(int[] i:customers){
6            chef=Math.max(chef,i[0])+i[1];
7            wait+=chef-i[0];
8        }
9        return (double)wait/customers.length;
10    }
11}