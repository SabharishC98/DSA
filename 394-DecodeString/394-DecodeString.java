// Last updated: 6/17/2026, 4:04:44 PM
1class Solution {
2    public String decodeString(String s) {
3        Deque<Integer> numStack = new ArrayDeque<>();
4        Deque<StringBuilder> strStack = new ArrayDeque<>();
5        StringBuilder current = new StringBuilder();
6        int k = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9            char ch = s.charAt(i);
10
11            if (Character.isDigit(ch)) {
12                k = k * 10 + (ch - '0');      // ✅ handles 0 and multi-digit
13
14            } else if (ch == '[') {
15                numStack.push(k);              // save repeat count
16                strStack.push(current);        // save string built so far
17                current = new StringBuilder(); // fresh slate inside brackets
18                k = 0;
19
20            } else if (ch == ']') {
21                int count = numStack.pop();
22                StringBuilder repeated = new StringBuilder();
23                for (int j = 0; j < count; j++) repeated.append(current);
24                current = strStack.pop().append(repeated); // restore + append
25
26            } else {
27                current.append(ch);
28            }
29        }
30
31        return current.toString();
32    }
33}