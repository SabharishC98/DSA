// Last updated: 7/28/2026, 2:31:32 PM
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
11
12            for(int j=i;j<s.length();j++){
13                char ch=s.charAt(j);
14                temp.put(ch,temp.getOrDefault(ch,0)+1);
15                if(temp.get(ch)>=k && temp.get(ch)-1<k){
16                    count++;
17                }
18                if(count==temp.size()){
19                    max=Math.max(max,j-i+1);
20                }
21                if(map.get(ch)-temp.get(ch)==0 && temp.get(ch)<k) break;
22            }
23            map.put(s.charAt(i),map.get(s.charAt(i))-1);
24        }
25        // int i=0,j=0,max=0;
26        // Map<Character,Integer> temp=new HashMap<>();
27        // while(j<s.length() && i<s.length()){
28        //     char ch=s.charAt(j);
29        //     temp.put(ch,temp.getOrDefault(ch,0)+1);
30        //     if(temp.get(ch)>=k && temp.get(ch)-1<k){
31        //         count++;
32        //     }
33        //     if(count==temp.size()){
34        //         max=Math.max(max,j-i+1);
35        //         System.out.println(i+" "+j);
36        //     }
37        //     while(i<=j && map.get(ch)-temp.get(ch)<=0 && temp.get(ch)<k){
38        //         System.out.println(i+" iubiubs "+j);
39        //         char c=s.charAt(i);
40        //         temp.put(c,temp.getOrDefault(c,0)-1);
41        //         if(temp.get(c)<k && temp.get(c)+1==k) count--;
42        //         if(count==temp.size()){
43        //             max=Math.max(max,j-i+1);
44        //         }
45        //         if(temp.get(c)==0) temp.remove(c);
46        //         j=i;
47        //         i++;
48        //         count=0;
49        //         temp=new HashMap<>();
50        //         break;
51        //     }
52        //     j++;
53        //     if(j==s.length()){
54        //         i++;
55        //         j=i;
56        //     }
57        // }
58        return max;
59    }
60}