// Last updated: 3/24/2026, 11:31:46 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int len=matrix.length*matrix[0].length;
        int row=matrix.length,col=matrix[0].length,r=0,c=0,count=0;
        ArrayList<Integer> al=new ArrayList<>(len);
        while(count<len){
            while(c<col && count<len){
                al.add(matrix[r][c]);
                c++;
                count++;
            }
            c--;
            r++;
            while(r<row && count<len){
                al.add(matrix[r][c]);
                r++;
                count++;
            }
            r--;
            c--;
            while(c>=matrix[0].length-col && count<len){
                al.add(matrix[r][c]);
                c--;
                count++;
            }
            c++;
            r--;
            while(r>matrix.length-row && count<len){
                al.add(matrix[r][c]);
                r--;
                count++;
            }
            r++;
            c++;
            col--;
            row--;
        }
        return al;
    }
}