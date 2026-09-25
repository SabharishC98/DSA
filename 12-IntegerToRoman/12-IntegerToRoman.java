// Last updated: 9/25/2026, 2:56:18 PM
class Solution {
    public String intToRoman(int num) {
        int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] syms = {"M","CM","D","CD","C","XC","L",
                         "XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vals.length; i++) {
            while (num >= vals[i]) {
                sb.append(syms[i]);
                num -= vals[i];   // greedy subtract
            }
        }
        return sb.toString();
    }
}