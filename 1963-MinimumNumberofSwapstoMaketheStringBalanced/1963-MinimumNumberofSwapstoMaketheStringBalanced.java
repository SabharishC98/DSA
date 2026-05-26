// Last updated: 5/26/2026, 11:16:40 PM
1class Solution {
2    public int minSwaps(String s) {
3        // int open = 0, ans = 0;
4        
5        // // Pass 1: count unmatched ']'
6        // int unmatched = 0;
7        // for (char c : s.toCharArray()) {
8        //     if (c == '[') open++;
9        //     else {
10        //         if (open > 0) open--;  // matched
11        //         else unmatched++;       // unmatched ']'
12        //     }
13        // }
14        
15        // // Each swap fixes 2 unmatched brackets
16        // // unmatched is always even (valid input guaranteed)
17        // return (unmatched + 1) / 2;
18
19
20        int ans=0,c=0,o=0;
21        int n=s.length()-1,i=0;
22        while(i<s.length()){
23            if(s.charAt(i)==']'){
24                c++;
25            }
26            else{
27                o++;
28            }
29            if(c>o){
30                while(i<n && s.charAt(n)==']'){
31                    n--;
32                }
33                n--;
34                ans++;
35                c--;
36                o++;
37            }
38
39            i++;
40        }
41        return ans;
42    }
43}