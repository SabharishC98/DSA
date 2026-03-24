// Last updated: 3/24/2026, 11:23:25 AM
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