// Last updated: 3/24/2026, 11:20:40 AM
import java.util.*;

class Solution {
    public int distinctPoints(String s, int k) {
        int n = s.length();
        if (n == k) return 1;

        Map<Character, int[]> map = Map.of(
            'U', new int[]{0, 1},
            'D', new int[]{0, -1},
            'L', new int[]{-1, 0},
            'R', new int[]{1, 0}
        );

        int totalX = 0, totalY = 0;
        for (int i = 0; i < n; i++) {
            totalX += map.get(s.charAt(i))[0];
            totalY += map.get(s.charAt(i))[1];
        }

        int remX = 0, remY = 0;
        for (int i = 0; i < k; i++) {
            remX += map.get(s.charAt(i))[0];
            remY += map.get(s.charAt(i))[1];
        }

        Set<String> set = new HashSet<>();
        set.add((totalX - remX) + "," + (totalY - remY));

        for (int i = 1; i + k - 1 < n; i++) {
            remX -= map.get(s.charAt(i - 1))[0];
            remY -= map.get(s.charAt(i - 1))[1];
            remX += map.get(s.charAt(i + k - 1))[0];
            remY += map.get(s.charAt(i + k - 1))[1];
            set.add((totalX - remX) + "," + (totalY - remY));
        }

        return set.size();
    }
}
