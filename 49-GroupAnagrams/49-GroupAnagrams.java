// Last updated: 3/24/2026, 11:31:52 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] cList = s.toCharArray();
            Arrays.sort(cList);
            String sig = new String(cList);
            if (!map.containsKey(sig)) {
                List<String> list = new ArrayList<String>();
                map.put(sig, list);
            }
            map.get(sig).add(s);
        }
        List<List<String>> result = new ArrayList<>();
        for(String s: map.keySet()) {
            result.add(map.get(s));
        }
        return result;
    }
}