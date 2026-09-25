// Last updated: 9/25/2026, 2:49:36 PM
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){
            if(citations[i]<citations.length-i) return citations.length-i-1;
        }
        return citations.length;
    }
}