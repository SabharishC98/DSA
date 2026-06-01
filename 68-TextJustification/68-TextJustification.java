// Last updated: 6/1/2026, 11:24:12 PM
1class Solution {
2    public List<String> fullJustify(String[] words, int maxWidth) {
3        List<String> result = new ArrayList<>();
4        int i = 0;
5
6        while (i < words.length) {
7            int lineLen = words[i].length();
8            int j = i + 1;
9
10            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
11                lineLen += 1 + words[j].length();
12                j++;
13            }
14
15            result.add(buildLine(words, i, j, maxWidth, j == words.length));
16            i = j;
17        }
18
19        return result;
20    }
21
22    public String buildLine(String[] words, int start, int end,
23                             int maxWidth, boolean isLastLine) {
24        int totalChars = 0;
25        for (int i = start; i < end; i++) {
26            totalChars += words[i].length();
27        }
28
29        int numWords = end - start;
30        int totalSpaces = maxWidth - totalChars;
31        StringBuilder sb = new StringBuilder();
32        if (isLastLine || numWords == 1) {
33            for (int i = start; i < end; i++) {
34                sb.append(words[i]);
35                if (i < end - 1) sb.append(" ");
36            }
37            while (sb.length() < maxWidth) sb.append(" ");
38            return sb.toString();
39        }
40
41        int gaps = numWords - 1;
42        int spacePerGap = totalSpaces / gaps;
43        int extraSpaces = totalSpaces % gaps;  
44
45        for (int i = start; i < end; i++) {
46            sb.append(words[i]);
47            if (i < end - 1) {
48                int spaces = spacePerGap + (i - start < extraSpaces ? 1 : 0);
49                for (int s = 0; s < spaces; s++) sb.append(" ");
50            }
51        }
52
53        return sb.toString();
54    }
55}