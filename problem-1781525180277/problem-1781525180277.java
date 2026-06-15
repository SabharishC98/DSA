// Last updated: 6/15/2026, 5:36:20 PM
1class Solution {
2    public String largestMerge(String word1, String word2) {
3        int i=0,j=0;
4        StringBuilder sb=new StringBuilder();
5        while(i<word1.length() && j<word2.length()){
6            char ch1=word1.charAt(i);
7            char ch2=word2.charAt(j);
8            if(ch1>ch2){
9                sb.append(ch1);
10                i++;
11            }
12            else if(ch2>ch1){
13                sb.append(ch2);
14                j++;
15            }
16            else{
17                if(word1.substring(i).compareTo(word2.substring(j))>=0){
18                    sb.append(ch1);
19                    i++;
20                }
21                else{
22                    sb.append(ch2);
23                    j++;
24                }
25            }
26        }
27        while(i<word1.length()) sb.append(word1.charAt(i++));
28        while(j<word2.length()) sb.append(word2.charAt(j++));
29        return sb.toString();
30    }
31}