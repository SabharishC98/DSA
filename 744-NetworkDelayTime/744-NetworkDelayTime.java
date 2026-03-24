// Last updated: 3/24/2026, 11:26:31 AM
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] t : times) {
            int u = t[0], v = t[1], w = t[2];
            adj.get(u).add(new int[]{v, w});
        }

    
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[k] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];
            int dist = cur[1];

            if (dist > res[u]) continue;

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int w = edge[1];

                if (res[u] + w < res[v]) {
                    res[v] = res[u] + w;
                    pq.add(new int[]{v, res[v]});
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (res[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, res[i]);
        }

        return ans;
    }
}