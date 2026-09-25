// Last updated: 9/25/2026, 2:28:25 PM
class Solution {
    public int minimumOperations(String num) {
        char[][] last=new char[][]{{'0','0'},{'2','5'},{'5','0'},{'7','5'}};
        int min=num.length();
        for(char[] i:last){
            boolean f1=false,f2=false;
            int deletion=0;
            char ch1=i[0],ch2=i[1];
            for(int j=num.length()-1;j>=0;j--){
                char ch=num.charAt(j);
                if(ch=='0') min=Math.min(min,num.length()-1);
                if(!f1 && ch2==ch){
                    f1=true;
                }
                else if(f1 && ch1==ch){
                    f2=true;
                    break;
                }
                else deletion++;
            }
            if(f2) min=Math.min(min,deletion);
        }
        return min;
    }
}