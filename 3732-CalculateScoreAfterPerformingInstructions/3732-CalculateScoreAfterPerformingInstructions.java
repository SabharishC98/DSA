// Last updated: 3/24/2026, 11:20:55 AM
class Solution {
    public long calculateScore(String[] in, int[] values) {
        long sum=0;
        boolean visited[]=new boolean[values.length];
        int j=0;
        while(j<in.length && j>=0){
            if(visited[j]==true) break;
            visited[j]=true;
            if(in[j].equals("add")){
                sum+=values[j];
                j++;
            }
            else{
                j+=values[j];
            }
        }
        return sum;
    }
}