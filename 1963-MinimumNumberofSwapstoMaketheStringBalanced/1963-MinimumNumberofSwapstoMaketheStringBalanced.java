// Last updated: 5/26/2026, 11:10:33 PM
1class Solution {
2    public int minSwaps(String s) {
3        int ans=0,c=0,o=0;
4        int n=s.length()-1,i=0;
5        while(i<s.length()){
6            if(s.charAt(i)==']'){
7                c++;
8            }
9            else{
10                o++;
11            }
12            if(c>o){
13                while(i+1<=n && s.charAt(n)==']'){
14                    n--;
15                }
16                n--;
17                ans++;
18                c--;
19                o++;
20            }
21
22            i++;
23        }
24        return ans;
25    }
26}