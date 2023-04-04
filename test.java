import java.util.*;

class test {

    static HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>() {
        {
            put(10, new ArrayList<>(List.of(20, 40, 50)));
            put(20, new ArrayList<>(List.of(10, 40)));
            put(50, new ArrayList<>(List.of(10, 40, 30)));
            put(40, new ArrayList<>(List.of(10, 20, 30, 50)));
            put(30, new ArrayList<>(List.of(40, 50)));
        }
    };

    static void bfs(int node) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited.put(node, true);
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int a : graph.getOrDefault(temp, new ArrayList<>())) {
                if (!visited.containsKey(a)) {
                    q.offer(a);
                    visited.put(a, true);
                }
            }
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    static void dfs(int node) {
        HashMap<Integer, Boolean> visited = new HashMap<>();
        Deque<Integer> s = new ArrayDeque<>();
        s.push(node);
        visited.put(node, true);
        while (!s.isEmpty()) {
            int temp = s.poll();
            ArrayList<Integer> arr = graph.getOrDefault(temp, new ArrayList<>());
            for (int a = arr.size() - 1; a >= 0; a--) {
                if (!visited.containsKey(arr.get(a))) {
                    s.push(arr.get(a));
                    visited.put(arr.get(a), true);
                }
            }
            System.out.print(temp + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        dfs(30);
        bfs(30);

    }

}