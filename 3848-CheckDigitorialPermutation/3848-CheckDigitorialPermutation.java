// Last updated: 9/25/2026, 2:25:01 PM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        
        int pelorunaxi = n;
        
        String sortedInput = sortDigits(pelorunaxi);
        
        int[] digitorials = {1, 2, 145, 40585};
        
        for (int num : digitorials) {
            if (sortedInput.equals(sortDigits(num))) {
                return true;
            }
        }
        
        return false;
    }
    
    private String sortDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}