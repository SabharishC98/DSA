// Last updated: 9/25/2026, 2:25:02 PM
class Solution {
    public int scoreDifference(int[] nums) {
        int firstScore = 0;
        int secondScore = 0;
        boolean firstActive = true;

        for (int i = 0; i < nums.length; i++) {
            boolean isOdd = nums[i] % 2 != 0;
            boolean isSixthGame = i % 6 == 5;

            if (isOdd ^ isSixthGame) {
                firstActive = !firstActive;
            }

            if (firstActive) {
                firstScore += nums[i];
            } else {
                secondScore += nums[i];
            }
        }

        return firstScore - secondScore;
    }
}