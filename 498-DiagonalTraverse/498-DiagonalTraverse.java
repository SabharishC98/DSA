// Last updated: 3/24/2026, 11:27:41 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0,c=0,j=0,r=0;
        boolean up=true;
        int arr[]=new int[mat.length*mat[0].length]; 
        while(c<mat.length*mat[0].length){
            arr[c++]=mat[i][j];
            if(up==true){
                i--;
                j++;
                if(j>=mat[0].length){
                    i+=2;
                    j--;
                    up=false;
                    
                }
                else if(i<0){
                    i++;
                    up=false;
                }
            }
            else{
                i++;
                j--;
                if(i>=mat.length){
                    j+=2;
                    i--;
                    up=true;
                }
                else if(j<0){
                    j++;
                    up=true;
                }
            }
        }
        return arr;
    }
}