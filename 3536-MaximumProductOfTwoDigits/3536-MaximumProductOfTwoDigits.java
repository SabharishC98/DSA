// Last updated: 9/25/2026, 2:25:57 PM
class Solution {
    public int maxProduct(int n) {
        int max=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            arr.add(n%10);
            n/=10;
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                max=Math.max(max,arr.get(i)*arr.get(j));
            }
        }
        return max;
    }
}