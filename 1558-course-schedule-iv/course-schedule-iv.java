import java.util.*;

class Solution {
    private void dfs(int node, List<List<Integer>> adj, boolean[] visited, Set<Pair<Integer, Integer>> prerequisites, int start) {
        visited[node] = true;

        if (start != -1) {
            prerequisites.add(new Pair<>(start, node));
        }

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, visited, prerequisites, start);
            }
        }
    }

    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] q) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] p : pre) {
            adj.get(p[0]).add(p[1]);
        }

        Set<Pair<Integer, Integer>> prerequisites = new HashSet<>();
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n]; // Reset visited array for each node
            dfs(i, adj, visited, prerequisites, i);
        }

        List<Boolean> result = new ArrayList<>();
        for (int[] query : q) {
            result.add(prerequisites.contains(new Pair<>(query[0], query[1])));
        }
        return result;
    }
}