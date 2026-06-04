// Last updated: 6/4/2026, 12:28:37 PM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int c=0;
4        for(int i=num1;i<=num2;i++){
5            String s=String.valueOf(i);
6            if(s.length()==0) continue;
7            for(int j=1;j<s.length()-1;j++){
8                if(s.charAt(j)<s.charAt(j-1) && s.charAt(j)<s.charAt(j+1)){
9                    c++;
10                }
11                else if(s.charAt(j)>s.charAt(j-1) && s.charAt(j)>s.charAt(j+1)){
12                    c++;
13                }
14            }
15        }
16        return c;
17    }
18}