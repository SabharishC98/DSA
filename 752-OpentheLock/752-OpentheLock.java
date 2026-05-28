// Last updated: 5/29/2026, 1:46:26 AM
1class Solution {
2    public int minMutation(String beginWord, String endWord, String[] words) {
3        List<String> wordList=new ArrayList<>();
4        for(String i:words){
5            wordList.add(i);
6        }
7        if (!wordList.contains(endWord)) {
8            return -1;
9        }
10
11        int L = beginWord.length();
12
13        // Map: generic pattern -> list of words
14        Map<String, List<String>> patternMap = new HashMap<>();
15
16        for (String word : wordList) {
17            for (int i = 0; i < L; i++) {
18                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);
19                patternMap.computeIfAbsent(pattern, k -> new ArrayList<>()).add(word);
20            }
21        }
22
23        Queue<String> queue = new LinkedList<>();
24        queue.offer(beginWord);
25
26        Map<String, Integer> distance = new HashMap<>();
27        distance.put(beginWord, 1);
28
29        while (!queue.isEmpty()) {
30            String current = queue.poll();
31            int level = distance.get(current);
32
33            for (int i = 0; i < L; i++) {
34                String pattern = current.substring(0, i) + "*" + current.substring(i + 1);
35
36                List<String> neighbors = patternMap.getOrDefault(pattern, Collections.emptyList());
37                for (String next : neighbors) {
38                    if (next.equals(endWord)) {
39                        return level ;
40                    }
41
42                    if (!distance.containsKey(next)) {
43                        distance.put(next, level + 1);
44                        queue.offer(next);
45                    }
46                }
47
48                // Important optimization
49                patternMap.put(pattern, Collections.emptyList());
50            }
51        }
52
53        return -1;
54    }
55}