// Last updated: 3/24/2026, 11:23:51 AM
import java.util.*;

class Solution {

    public int minOperations(int[] target, int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<target.length;i++)
            map.put(target[i], i);

        List<Integer> list = new ArrayList<>();

        for(int num : arr){

            if(map.containsKey(num))
                list.add(map.get(num));
        }

        int[] dp = new int[list.size()];
        int size = 0;

        for(int x : list){

            int i = Arrays.binarySearch(dp, 0, size, x);

            if(i < 0)
                i = -(i + 1);

            dp[i] = x;

            if(i == size)
                size++;
        }

        return target.length - size;
    }
}