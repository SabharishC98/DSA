// Last updated: 6/4/2026, 10:51:10 AM
1class Solution {
2    HashMap<String,Boolean> dp=new HashMap<>();
3    public boolean isScramble(String s1, String s2) {
4        // if(s1.length()!=s2.length()) return false;
5        // if(s1.equals(s2)){
6        //     return true;
7        // }
8        // if(s1.length()==1) return false;
9        // if(dp.containsKey(s1+" "+s2)) return dp.get(s1+" "+s2);
10        // for(int i=1;i<s1.length();i++){
11        //     boolean case1=isScramble(s1.substring(0,i),s2.substring(0,i)) , case2=isScramble(s1.substring(i),s2.substring(i));
12        //     if(case1 && case2){
13        //         dp.put(s1+" "+s2,true);
14        //         return true;
15        //     }
16        //     case1=isScramble(s1.substring(0,i),s2.substring(s1.length()-i)) ; case2=isScramble(s1.substring(i),s2.substring(0,s1.length()-i));
17        //     if(case1 && case2){
18        //         dp.put(s1+" "+s2,true);
19        //         return true;
20        //     }
21
22        // }
23        // dp.put(s1+" "+s2,false);
24        // return dp.get(s1+" "+s2);
25
26        int n = s1.length();
27        // dp[i][j][len] = is s1[i..i+len) a scramble of s2[j..j+len)?
28        boolean[][][] dp = new boolean[n][n][n + 1];
29
30        // Base case: length 1
31        for (int i = 0; i < n; i++)
32            for (int j = 0; j < n; j++)
33                dp[i][j][1] = (s1.charAt(i) == s2.charAt(j));
34
35        // Fill for lengths 2..n
36        for (int len = 2; len <= n; len++) {
37            for (int i = 0; i <= n - len; i++) {
38                for (int j = 0; j <= n - len; j++) {
39                    // Try all split points k (left portion has length k)
40                    for (int k = 1; k < len && !dp[i][j][len]; k++) {
41                        // No swap
42                        dp[i][j][len] |= dp[i][j][k] && dp[i+k][j+k][len-k];
43                        // Swap
44                        dp[i][j][len] |= dp[i][j+len-k][k] && dp[i+k][j][len-k];
45                    }
46                }
47            }
48        }
49
50        return dp[0][0][n];
51    }
52}