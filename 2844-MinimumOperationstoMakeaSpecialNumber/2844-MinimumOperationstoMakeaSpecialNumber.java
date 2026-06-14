// Last updated: 6/15/2026, 12:18:54 AM
1class Solution {
2    public int minimumOperations(String num) {
3        char[][] last=new char[][]{{'0','0'},{'2','5'},{'5','0'},{'7','5'}};
4        long zeros = num.chars().filter(c -> c == '0').count();
5        int min = zeros > 0 ? num.length() - 1 : num.length();
6        for(char[] i:last){
7            boolean f1=false,f2=false;
8            int deletion=0;
9            char ch1=i[0],ch2=i[1];
10            for(int j=num.length()-1;j>=0;j--){
11                char ch=num.charAt(j);
12                if(!f1 && ch2==ch){
13                    f1=true;
14                }
15                else if(f1 && ch1==ch){
16                    f2=true;
17                    break;
18                }
19                else deletion++;
20            }
21            if(f2) min=Math.min(min,deletion);
22        }
23        return min;
24    }
25}