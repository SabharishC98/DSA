// Last updated: 9/25/2026, 2:34:20 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int l=words.length;
        int arr[] = new int[26];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                arr[(words[i].charAt(j)) - 97] += 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] % l != 0)
                return false;
        }
        return true;
    }
}