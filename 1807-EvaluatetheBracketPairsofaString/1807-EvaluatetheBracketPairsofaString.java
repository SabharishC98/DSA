// Last updated: 9/26/2026, 12:05:06 PM
1class Solution {
2    public String evaluate(String s, List<List<String>> knowledge) {
3        Map<String,String> map=new HashMap<>();
4        StringBuilder sb=new StringBuilder("");
5        StringBuilder temp=new StringBuilder("");
6        boolean found=false;
7        for(List<String> i:knowledge){
8            map.put(i.get(0),i.get(1));
9        }
10        for(char ch:s.toCharArray()){
11            if(!found){
12                if(ch!='('){
13                    sb.append(ch);
14                }
15                else{
16                    found=true;
17                }
18            }
19            else{
20                if(ch!=')'){
21                    temp.append(ch);
22                }
23                else{
24                    found=false;
25                    String t=temp.toString();
26                    if(!map.containsKey(t)){
27                        sb.append('?');
28                    }
29                    else{
30                        sb.append(map.get(t));
31                    }
32                    temp=new StringBuilder("");
33                }
34            }
35        }
36        return sb.toString();
37    }
38}