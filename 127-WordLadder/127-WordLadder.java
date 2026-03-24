// Last updated: 3/24/2026, 11:30:28 AM
import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        int L = beginWord.length();

        // Map: generic pattern -> list of words
        Map<String, List<String>> patternMap = new HashMap<>();

        for (String word : wordList) {
            for (int i = 0; i < L; i++) {
                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);
                patternMap.computeIfAbsent(pattern, k -> new ArrayList<>()).add(word);
            }
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        Map<String, Integer> distance = new HashMap<>();
        distance.put(beginWord, 1);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int level = distance.get(current);

            for (int i = 0; i < L; i++) {
                String pattern = current.substring(0, i) + "*" + current.substring(i + 1);

                List<String> neighbors = patternMap.getOrDefault(pattern, Collections.emptyList());
                for (String next : neighbors) {
                    if (next.equals(endWord)) {
                        return level + 1;
                    }

                    if (!distance.containsKey(next)) {
                        distance.put(next, level + 1);
                        queue.offer(next);
                    }
                }

                // Important optimization
                patternMap.put(pattern, Collections.emptyList());
            }
        }

        return 0;
    }
}
