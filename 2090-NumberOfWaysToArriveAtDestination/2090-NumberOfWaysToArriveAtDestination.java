// Last updated: 3/24/2026, 11:23:22 AM
import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;

    public int countPaths(int n, int[][] roads) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0], v = road[1], w = road[2];
            map.get(u).add(new int[]{v, w});
            map.get(v).add(new int[]{u, w});
        }

        long[] dist = new long[n];
        long[] ways = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] x = pq.poll();
            int u = (int) x[0];
            long d = x[1];

            if (d > dist[u]) continue;

            for (int[] neighbor : map.get(u)) {
                int v = neighbor[0];
                int weight = neighbor[1];

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    ways[v] = ways[u];
                    pq.add(new long[]{v, dist[v]});
                } else if (dist[u] + weight == dist[v]) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }

        return (int) ways[n - 1];
    }
}