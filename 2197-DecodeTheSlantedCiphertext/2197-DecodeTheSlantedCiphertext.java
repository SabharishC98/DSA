// Last updated: 3/24/2026, 11:23:06 AM
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        StringBuilder sb=new StringBuilder();
        int n=encodedText.length();
        System.out.println(n);
        char[][] arr=new char[rows][n/rows];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<n/rows;j++){
                arr[i][j]=encodedText.charAt(k++);
                // System.out.print(arr[i][j]);
            }
            // System.out.println();
        }
        int i=0,j=0,l=0;
        while(j<n/rows){
            sb.append(arr[i][j]);
            i++;
            j++;
            if(i>=rows){
                i=0;
                j=l+1;
                l++;
            }
        }
        return sb.toString().stripTrailing();
    }
}