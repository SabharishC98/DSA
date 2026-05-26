// Last updated: 5/26/2026, 10:36:06 PM
1class Solution {
2    Set<String> ans = new HashSet<>();
3    int min = Integer.MAX_VALUE;
4
5    public List<String> removeInvalidParentheses(String s) {
6        int openCount = 0, closeCount = 0;
7        for (char c : s.toCharArray()) {
8            if (c == '(')
9                openCount++;
10            else if (c == ')') {
11                if (openCount > 0)
12                    openCount--;
13                else
14                    closeCount++;
15            }
16        }
17        min = openCount + closeCount; // exact minimum deletions
18        back(s, 0, 0, 0, new StringBuilder(), 0);
19        return new ArrayList<>(ans);
20    }
21
22    public void back(String s, int index, int open, int close, StringBuilder sb, int deleted) {
23        if (open < close) {
24            // System.out.println("close");
25            return;
26        }
27        if (deleted > min)
28            return;
29        if (index == s.length()) {
30            if (open == close && deleted == min) {
31                String result = sb.toString();
32                if (!ans.contains(result)) {
33                    ans.add(result);
34                }
35            }
36            return;
37        }
38        char ch = s.charAt(index);
39        if (ch == '(') {
40            sb.append('(');
41            back(s, index + 1, open + 1, close, sb, deleted);
42            // System.out.println("open " + sb);
43            sb.deleteCharAt(sb.length() - 1);
44            back(s, index + 1, open, close, sb, deleted + 1);
45            // System.out.println("open c" + sb);
46        } else if (ch == ')') {
47            sb.append(')');
48            back(s, index + 1, open, close + 1, sb, deleted);
49            // System.out.println("close " + sb);
50            sb.deleteCharAt(sb.length() - 1);
51            back(s, index + 1, open, close, sb, deleted + 1);
52            // System.out.println("close c" + sb);
53        } else {
54            sb.append(ch);
55            back(s, index + 1, open, close, sb, deleted);
56            sb.deleteCharAt(sb.length() - 1);
57            // System.out.println("spl " + sb + " " + index + " " + open + " " + close);
58        }
59    }
60}