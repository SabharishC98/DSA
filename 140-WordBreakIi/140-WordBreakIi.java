// Last updated: 3/24/2026, 11:30:17 AM
import java.util.*;

public class Solution {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return dfs(s, set, memo);
    }

    private List<String> dfs(String s, Set<String> dict, Map<String, List<String>> memo) {

        if (memo.containsKey(s))
            return memo.get(s);

        List<String> result = new ArrayList<>();

        if (s.length() == 0) {
            result.add("");
            return result;
        }

        for (String word : dict) {
            if (s.startsWith(word)) {

                List<String> subList = dfs(s.substring(word.length()), dict, memo);

                for (String sub : subList) {
                    result.add(word + (sub.equals("") ? "" : " " + sub));
                }
            }
        }

        memo.put(s, result);
        return result;
    }
}