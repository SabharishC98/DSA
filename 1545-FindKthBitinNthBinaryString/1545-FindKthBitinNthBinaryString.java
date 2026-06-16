// Last updated: 6/16/2026, 10:23:54 AM
1class Solution {
2    public char findKthBit(int n, int k) {
3        StringBuilder sb=new StringBuilder("0");
4        for(int i=1;i<n;i++){
5            String flipped = sb.toString()
6                .replace('0', '2')
7                .replace('1', '0')
8                .replace('2', '1');
9            sb.append('1').append(new StringBuilder(flipped).reverse());
10        }
11        // System.out.println(sb);
12        return sb.charAt(k-1);
13    }
14}