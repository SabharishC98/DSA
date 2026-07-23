// Last updated: 7/23/2026, 11:19:24 AM
1class Solution {
2    public String customSortString(String order, String s) {
3        int[] index=new int[26];
4        Character[] ch=new Character[s.length()];
5        for(int i=0;i<order.length();i++){
6            index[order.charAt(i)-'a']=i;
7        }
8        for(int i=0;i<s.length();i++){
9            ch[i]=s.charAt(i);
10        }
11        Arrays.sort(ch,(a,b)->index[a-'a']-index[b-'a']);
12        StringBuilder sb=new StringBuilder("");
13        for(int i=0;i<ch.length;i++){
14            sb.append(ch[i]);
15        }
16        return sb.toString();
17    }
18}