// Last updated: 3/24/2026, 11:32:38 AM
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int min=0;
        while(i<j){
            int min_el;
            if(height[i]<height[j]){
                min_el=height[i];
            }
            else{
                min_el=height[j];
            }
            min_el*=(j-i);
            if(min<min_el){
                min=min_el;
            }
            if(height[i]<=height[j]){
                i++;
                continue;
            }
            else{
                j--;
                continue;
            }
        }
        return min;
    }
}