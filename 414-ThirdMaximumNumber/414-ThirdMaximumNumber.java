// Last updated: 3/24/2026, 11:28:08 AM
class Solution {
    public int thirdMax(int[] nums) {
        Integer thirdmax=null;
        Integer firstmax=null;
        Integer secmax=null;
        for(Integer i : nums){
            
           if((i.equals(firstmax))||(i.equals(secmax))|| (i.equals(thirdmax)))
           continue;
           if(firstmax==null || i>firstmax)
           {
            thirdmax=secmax;
            secmax=firstmax;
            firstmax=i;
           }
            else if(secmax==null || i>secmax)
            {
                thirdmax=secmax;
                secmax=i;
            }
            else if (thirdmax==null || i>thirdmax)
            {
                thirdmax=i;
            }
        }
        
        return   thirdmax == null ? firstmax : thirdmax;
    }
}