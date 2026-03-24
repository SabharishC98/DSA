// Last updated: 3/24/2026, 11:24:13 AM
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