// Last updated: 9/25/2026, 2:39:18 PM
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) { 
            int temp = start;
            start = destination;
            destination = temp;
        }
        int sum = 0, part = 0;
        for (int i = 0; i < distance.length; i++) sum += distance[i];
        for (int i = start; i < destination; i++) part += distance[i];
        return Math.min(part, sum - part);
    }
}
