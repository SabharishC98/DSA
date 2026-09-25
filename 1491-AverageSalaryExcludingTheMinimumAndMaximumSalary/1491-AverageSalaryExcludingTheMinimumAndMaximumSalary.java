// Last updated: 9/25/2026, 2:37:03 PM
class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<salary.length;i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }
        int total=0;
        for(int i=0;i<salary.length;i++){
                total+=salary[i];
        }
        return (double)(total-min-max)/(salary.length-2);
    }
}