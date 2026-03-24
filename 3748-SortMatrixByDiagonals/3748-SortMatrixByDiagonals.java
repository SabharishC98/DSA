// Last updated: 3/24/2026, 11:20:53 AM
class Solution {
    public int[][] sortMatrix(int[][] mat) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.putIfAbsent(i-j,new ArrayList<>());
                map.get(i-j).add(mat[i][j]);
            }
        }
        for(int i:map.keySet()) Collections.sort(map.get(i));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i-j<0){
                mat[i][j]=map.get(i-j).get(0);
                map.get(i-j).remove(0);}
                else{
                    mat[i][j]=map.get(i-j).get(map.get(i-j).size()-1);
                    map.get(i-j).remove(map.get(i-j).size()-1);
                }
            }
        }
        return mat;
    }
}