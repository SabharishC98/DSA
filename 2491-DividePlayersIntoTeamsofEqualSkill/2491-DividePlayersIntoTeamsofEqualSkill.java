// Last updated: 6/18/2026, 9:26:12 AM
1class Solution {
2    public long dividePlayers(int[] skill) {
3        Arrays.sort(skill);
4        int i=1,j=skill.length-2;
5        int sum=skill[0]+skill[j+1];
6        long prod=skill[0]*skill[j+1];
7        while(i<j){
8            if(skill[i]+skill[j]!=sum) return -1;
9            prod+=skill[i]*skill[j];
10            i++;
11            j--;
12        }
13        return prod;
14    }
15}