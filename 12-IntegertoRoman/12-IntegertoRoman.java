// Last updated: 6/9/2026, 9:58:07 PM
1class Solution {
2    public String intToRoman(int num) {
3        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
4        String[] syms = {"M","CM","D","CD","C","XC","L",
5                         "XL","X","IX","V","IV","I"};
6
7        StringBuilder sb = new StringBuilder();
8        for (int i = 0; i < vals.length; i++) {
9            while (num >= vals[i]) {
10                sb.append(syms[i]);
11                num -= vals[i];   // greedy subtract
12            }
13        }
14        return sb.toString();
15    }
16}