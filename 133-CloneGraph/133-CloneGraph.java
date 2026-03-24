// Last updated: 3/24/2026, 11:30:22 AM
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        map.put(node, new Node(node.val));
        q.add(node);

        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (Node neigh : cur.neighbors) {
                if (!map.containsKey(neigh)) {
                    map.put(neigh, new Node(neigh.val));
                    q.add(neigh);
                }
                map.get(cur).neighbors.add(map.get(neigh));
            }
        }
        return map.get(node);
    }
}
