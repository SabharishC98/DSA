// Last updated: 3/24/2026, 11:30:34 AM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp=new ArrayList<>();
        for(int i=0;i<triangle.size();i++){
            dp.add(new ArrayList<>());
            for(int j=0;j<triangle.get(i).size();j++){
                if(i==0 && j==0) dp.get(i).add(triangle.get(i).get(j));
                else if(j>0 && j<dp.get(i-1).size()){
                    dp.get(i).add(Math.min(dp.get(i-1).get(j),dp.get(i-1).get(j-1))+triangle.get(i).get(j));
                }
                else if(j==0){
                    dp.get(i).add(dp.get(i-1).get(j)+triangle.get(i).get(j));
                }
                else{
                    dp.get(i).add(dp.get(i-1).get(j-1)+triangle.get(i).get(j));
                }
            }
        }

        int min=Integer.MAX_VALUE;
        int n=triangle.get(triangle.size()-1).size();
        for(int i=0;i<n;i++){
            min=Math.min(min,dp.get(triangle.size()-1).get(i));
        }
        return min;
    }
}