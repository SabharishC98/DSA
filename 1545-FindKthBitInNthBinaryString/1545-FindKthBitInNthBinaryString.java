// Last updated: 9/25/2026, 2:36:28 PM
class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb=new StringBuilder("0");
        for(int i=1;i<n;i++){
            String flipped = sb.toString()
                .replace('0', '2')
                .replace('1', '0')
                .replace('2', '1');
            sb.append('1').append(new StringBuilder(flipped).reverse());
        }
        // System.out.println(sb);
        return sb.charAt(k-1);
    }
}