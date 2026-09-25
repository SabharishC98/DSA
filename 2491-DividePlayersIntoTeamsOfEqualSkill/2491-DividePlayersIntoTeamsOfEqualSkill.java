// Last updated: 9/25/2026, 2:30:29 PM
class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=1,j=skill.length-2;
        int sum=skill[0]+skill[j+1];
        long prod=skill[0]*skill[j+1];
        while(i<j){
            if(skill[i]+skill[j]!=sum) return -1;
            prod+=skill[i]*skill[j];
            i++;
            j--;
        }
        return prod;
    }
}