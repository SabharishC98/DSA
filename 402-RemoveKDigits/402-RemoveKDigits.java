// Last updated: 6/14/2026, 10:44:03 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        Deque<Character> stack=new ArrayDeque<>();
4        for(char c:num.toCharArray()){
5            while(!stack.isEmpty() && k>0 && stack.peek()>c){
6                stack.pop();
7                k--;
8            }
9            stack.push(c);
10        }
11        while(k-->0) stack.pop();
12        StringBuilder sb=new StringBuilder();
13        boolean leadingZero=true;
14        while(!stack.isEmpty()){
15            sb.append(stack.pollLast()); 
16        }
17        while(sb.length()>1 && sb.charAt(0)=='0'){
18            sb.deleteCharAt(0);
19        }
20        return sb.length()==0?"0":sb.toString();
21    }
22}