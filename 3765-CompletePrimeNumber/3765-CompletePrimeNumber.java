// Last updated: 9/25/2026, 2:25:18 PM
class Solution {
    int[] arr = new int[]{2, 3, 5, 7, 23, 37, 53, 73, 313, 317, 373, 797, 3137, 3797, 739397};

    public boolean completePrime(int num) {
        for(int i=0;i<arr.length;i++) if(arr[i]==num) return true;
        return false;
    }
}