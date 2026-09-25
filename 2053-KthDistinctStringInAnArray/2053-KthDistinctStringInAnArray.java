// Last updated: 9/25/2026, 2:33:33 PM
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                if(--k==0) return arr[i];
            }
        }
        return "";
    }
}