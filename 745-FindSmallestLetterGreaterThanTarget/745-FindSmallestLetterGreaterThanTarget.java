// Last updated: 3/24/2026, 11:26:30 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target) return letters[i];
        }
        return letters[0];
    }
}