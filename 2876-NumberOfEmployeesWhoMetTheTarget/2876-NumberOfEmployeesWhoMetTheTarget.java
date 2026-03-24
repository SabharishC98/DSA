// Last updated: 3/24/2026, 11:21:40 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]>=target) c++;
        }
        return c;
    }
}