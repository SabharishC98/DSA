// Last updated: 7/25/2026, 3:01:08 PM
1class Solution {
2    List<Integer> l;
3    public String originalDigits(String s) {
4        Map<Character,Integer> map=new HashMap<>();
5        for(char ch:s.toCharArray()){
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        char characters[]=new char[]{'u','w','z','x','g','h','o','t','s','v','i'};
9        l=new ArrayList<>();
10        for(char ch:characters){
11            if(!map.containsKey(ch) || map.get(ch)==0) continue;
12            int count=map.get(ch);
13            if(ch=='u'){
14                map.remove('u');
15                map.put('f',map.get('f')-count);
16                map.put('o',map.get('o')-count);
17                map.put('r',map.get('r')-count);
18                addelement(4,count);
19            }
20            else if(ch=='w'){
21                map.remove('w');
22                map.put('t',map.get('t')-count);
23                map.put('o',map.get('o')-count);
24                addelement(2,count);
25            }
26            else if(ch=='z'){
27                map.remove('z');
28                map.put('e',map.get('e')-count);
29                map.put('r',map.get('r')-count);
30                map.put('o',map.get('o')-count);
31                addelement(0,count);
32            }
33            else if(ch=='x'){
34                map.remove('x');
35                map.put('s',map.get('s')-count);
36                map.put('i',map.get('i')-count);
37                addelement(6,count);
38            }
39            else if(ch=='g'){
40                map.remove('g');
41                map.put('e',map.get('e')-count);
42                map.put('i',map.get('i')-count);
43                map.put('h',map.get('h')-count);
44                map.put('t',map.get('t')-count);
45                addelement(8,count);
46            }
47            else if(ch=='h'){
48                map.remove('h');
49                map.put('e',map.get('e')-2*count);
50                map.put('r',map.get('r')-count);
51                map.put('t',map.get('t')-count);
52                addelement(3,count);
53            }
54            else if(ch=='o'){
55                map.remove('o');
56                map.put('e',map.get('e')-count);
57                map.put('n',map.get('n')-count);
58                addelement(1,count);
59            }
60            else if(ch=='t'){
61                map.remove('t');
62                map.put('e',map.get('e')-count);
63                map.put('n',map.get('n')-count);
64                addelement(10,count);
65            }
66            else if(ch=='s'){
67                map.remove('s');
68                map.put('e',map.get('e')-2*count);
69                map.put('v',map.get('v')-count);
70                map.put('n',map.get('n')-count);
71                addelement(7,count);
72            }
73            else if(ch=='v'){
74                map.remove('v');
75                map.put('e',map.get('e')-count);
76                map.put('f',map.get('f')-count);
77                map.put('i',map.get('i')-count);
78                addelement(5,count);
79            }
80            else if(ch=='i'){
81                addelement(9,count);
82            }
83        }
84        Collections.sort(l);
85        StringBuilder sb=new StringBuilder("");
86        for(int i:l){
87            sb.append(i);
88        }
89        // System.out.println(l);
90        return sb.toString();
91    }
92    public void addelement(int num,int count){
93        while(count>0){
94            l.add(num);
95            count--;
96        }
97    }
98}