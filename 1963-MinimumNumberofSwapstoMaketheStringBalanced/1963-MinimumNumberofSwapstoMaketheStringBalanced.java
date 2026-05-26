// Last updated: 5/26/2026, 11:29:57 PM
1class Solution {
2    public String minRemoveToMakeValid(String s) {
3        Stack<Integer> stack = new Stack<>();
4        Set<Integer> remove = new HashSet<>();
5        
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            if (c == '(') {
9                stack.push(i);
10            } else if (c == ')') {
11                if (!stack.isEmpty()) stack.pop();  // matched
12                else remove.add(i);                  // unmatched ')'
13            }
14        }
15        
16        while (!stack.isEmpty()) remove.add(stack.pop());
17        
18        StringBuilder sb = new StringBuilder();
19        for (int i = 0; i < s.length(); i++) {
20            if (!remove.contains(i)) sb.append(s.charAt(i));
21        }
22        
23        return sb.toString();
24    }
25}