// Last updated: 9/25/2026, 2:41:52 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        boolean inc=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) return false;
            if(arr[i]<arr[i-1]){ inc=true; if(i==1) return false;}
            if(inc && arr[i]>=arr[i-1]) return false;
        }
        return inc;
    }
}