// Last updated: 5/25/2026, 12:09:15 PM
1class Solution {
2    public int hIndex(int[] citations) {
3        Arrays.sort(citations);
4        for(int i=citations.length-1;i>=0;i--){
5            if(citations[i]<citations.length-i) return citations.length-i-1;
6        }
7        return citations.length;
8    }
9}