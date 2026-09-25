// Last updated: 9/25/2026, 2:44:26 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}