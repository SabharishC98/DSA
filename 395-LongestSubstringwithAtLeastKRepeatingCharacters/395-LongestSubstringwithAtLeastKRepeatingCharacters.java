// Last updated: 7/28/2026, 2:32:38 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int max=0;
5        for(char ch:s.toCharArray()){
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        for(int i=0;i<s.length();i++){
9            int count=0;
10            Map<Character,Integer> temp=new HashMap<>();
11            if(s.length()-i<max) break;
12
13            for(int j=i;j<s.length();j++){
14                char ch=s.charAt(j);
15                temp.put(ch,temp.getOrDefault(ch,0)+1);
16                if(temp.get(ch)>=k && temp.get(ch)-1<k){
17                    count++;
18                }
19                if(count==temp.size()){
20                    max=Math.max(max,j-i+1);
21                }
22                if(map.get(ch)-temp.get(ch)==0 && temp.get(ch)<k) break;
23            }
24            map.put(s.charAt(i),map.get(s.charAt(i))-1);
25        }
26        // int i=0,j=0,max=0;
27        // Map<Character,Integer> temp=new HashMap<>();
28        // while(j<s.length() && i<s.length()){
29        //     char ch=s.charAt(j);
30        //     temp.put(ch,temp.getOrDefault(ch,0)+1);
31        //     if(temp.get(ch)>=k && temp.get(ch)-1<k){
32        //         count++;
33        //     }
34        //     if(count==temp.size()){
35        //         max=Math.max(max,j-i+1);
36        //         System.out.println(i+" "+j);
37        //     }
38        //     while(i<=j && map.get(ch)-temp.get(ch)<=0 && temp.get(ch)<k){
39        //         System.out.println(i+" iubiubs "+j);
40        //         char c=s.charAt(i);
41        //         temp.put(c,temp.getOrDefault(c,0)-1);
42        //         if(temp.get(c)<k && temp.get(c)+1==k) count--;
43        //         if(count==temp.size()){
44        //             max=Math.max(max,j-i+1);
45        //         }
46        //         if(temp.get(c)==0) temp.remove(c);
47        //         j=i;
48        //         i++;
49        //         count=0;
50        //         temp=new HashMap<>();
51        //         break;
52        //     }
53        //     j++;
54        //     if(j==s.length()){
55        //         i++;
56        //         j=i;
57        //     }
58        // }
59        return max;
60    }
61}