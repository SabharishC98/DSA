// Last updated: 7/21/2026, 9:39:38 AM
1class Solution {
2    public int minimumTotal(List<List<Integer>> triangle) {
3        List<List<Integer>> dp=new ArrayList<>();
4        for(int i=0;i<triangle.size();i++){
5            dp.add(new ArrayList<>());
6            for(int j=0;j<triangle.get(i).size();j++){
7                if(i==0 && j==0){
8                    dp.get(i).add(triangle.get(i).get(j));
9                }
10                else if(j==triangle.get(i).size()-1){
11                    dp.get(i).add(dp.get(i-1).get(dp.get(i-1).size()-1)+triangle.get(i).get(j));
12                }
13                else if(j==0){
14                    dp.get(i).add(dp.get(i-1).get(0)+triangle.get(i).get(j));
15                }
16                else{
17                    dp.get(i).add(Math.min(dp.get(i-1).get(j-1),dp.get(i-1).get(j))+triangle.get(i).get(j));
18                }
19            }
20        }
21        // for(int i=0;i<dp.size();i++) System.out.println(dp.get(i));
22        int min=Integer.MAX_VALUE;
23        // System.out.println(triangle.get(triangle.size()-1));
24        for(int i=0;i<dp.get(dp.size()-1).size();i++){
25            min=Math.min(min,dp.get(dp.size()-1).get(i));
26        }
27        return min;
28    }
29}