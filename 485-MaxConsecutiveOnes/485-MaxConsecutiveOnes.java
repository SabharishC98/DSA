// Last updated: 3/24/2026, 11:27:47 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0,j=0,max=0; while(j<arr.length){ if(arr[j]==0){ i=j+1; j=i; } else{ max=Math.max(max,j-i+1); j++; } } return max;
    }
}