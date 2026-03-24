// Last updated: 3/24/2026, 11:20:35 AM
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