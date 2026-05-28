// Last updated: 5/29/2026, 12:58:32 AM
1class Solution {
2    public int[] gardenNoAdj(int n, int[][] paths) {
3        Map<Integer, List<Integer>> map = new HashMap<>();
4        for (int i = 1; i <= n; i++) map.put(i, new ArrayList<>());
5        for (int[] path : paths) {
6            map.get(path[0]).add(path[1]);
7            map.get(path[1]).add(path[0]);
8        }
9
10        int[] color = new int[n];
11        Queue<Integer> q = new LinkedList<>();
12
13        for (int i = 1; i <= n; i++) {
14            if (color[i-1] != 0) continue;
15            color[i-1] = 1;
16            q.add(i);
17
18            while (!q.isEmpty()) {
19                int node = q.poll();
20                for (int neighbor : map.get(node)) {
21                    if (color[neighbor-1] == 0) {
22                        // Collect colors used by all neighbors of 'neighbor'
23                        Set<Integer> used = new HashSet<>();
24                        for (int nb : map.get(neighbor)) {
25                            used.add(color[nb-1]);
26                        }
27                        // Assign first available color
28                        for (int j = 1; j <= 4; j++) {
29                            if (!used.contains(j)) {
30                                color[neighbor-1] = j;
31                                break;
32                            }
33                        }
34                        q.add(neighbor);
35                    }
36                }
37            }
38        }
39        return color;
40    }
41}