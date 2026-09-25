// Last updated: 9/25/2026, 2:37:21 PM
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=-1;
        for(int i:m.keySet()) if(m.get(i)==i && max<i) max=i;
        return max;
    }
}