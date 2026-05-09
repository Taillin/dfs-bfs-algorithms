import java.util.*;

public class Graph {
    private Map<Integer, List<Vertex>> adjList;
    private Map<Integer, Vertex> vertices;

    public Graph() {
        this.adjList = new HashMap<>();
        this.vertices = new HashMap<>();
    }
    public void addVertex(Vertex v) {
        vertices.put(v.getId(), v);
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }
    public void addEdge(int from, int to){
        Vertex start = vertices.get(from);
        Vertex end = vertices.get(to);
        if (start != null && end != null) {
            adjList.get(from).add(end);
        }
    }
    public void printGraph() {
        for (int id : adjList.keySet()) {
            System.out.print("Vertex " + id + " is connected to: ");
            for (Vertex neighbor : adjList.get(id)) {
                System.out.print(neighbor.getId() + " ");
            }
            System.out.println();
        }
    }
    public void bsf(int id) {
        if(!vertices.containsKey(id)) return;

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(id);
        queue.add(id);

        System.out.print("BFS: ");

        while(!queue.isEmpty()) {
            int currentID = queue.poll();
            System.out.print(currentID + " ");

            for(Vertex neighbor : adjList.get(currentID)) {
                if(!visited.contains(neighbor.getId())) {
                    visited.add(neighbor.getId());
                    queue.add(neighbor.getId());
                }
            }
            System.out.println();
        }
    }
    public void dfs(int id) {
        if(!vertices.containsKey(id)) return;

        Set<Integer> visited = new HashSet<>();
        System.out.print("DSF: ");

        dsfRecursion(id, visited);
    }
    public void dsfRecursion(int currentID, Set<Integer> visited) {
        visited.add(currentID);

        System.out.print(currentID + " ");

        for(Vertex neighbor : adjList.get(currentID)) {
            if(!visited.contains(neighbor.getId())) {
                dsfRecursion(neighbor.getId(), visited);
            }
        }
    }
}
