// Last updated: 3/24/2026, 11:26:38 AM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int st=image[sr][sc];
        if(st==color) return image;
        check(sr,sc,color,image,st);
        return image;
    }
    public void check(int i,int j,int c,int[][] img,int st){
        img[i][j]=c;
        if(i>0 && img[i-1][j]==st) check(i-1,j,c,img,st);
        if(i<img.length-1 && img[i+1][j]==st) check(i+1,j,c,img,st);
        if( j>0 && img[i][j-1]==st) check(i,j-1,c,img,st);
        if(j<img[0].length-1 && img[i][j+1]==st) check(i,j+1,c,img,st);
    }
}