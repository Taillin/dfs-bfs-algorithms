import java.util.Random;

public class Experiment {
    private long bsfTime;
    private long dsfTime;

    public void runTraversals(Graph g) {
        int id = 1;

        long start = System.nanoTime();
        g.bsf(id);
        long end = System.nanoTime();
        bsfTime = end - start;

        start = System.nanoTime();
        g.dfs(id);
        end = System.nanoTime();
        dsfTime = end - start;
    }

    private Graph createRandomGraph(int nodes, int edges) {
        Graph g = new Graph();
        Random r = new Random();

        for (int i = 1; i <= nodes; i++){
            g.addVertex(new Vertex(i));
        }

        for (int i = 1; i < edges; i++) {
            int from = r.nextInt(nodes) + 1;
            int to = r.nextInt(nodes) + 1;
        }
        return g;
    }
    public void printResults() {
        System.out.println("---------------------------------------");
        System.out.println("BSF Time: " + bsfTime + " nanoseconds");
        System.out.println("DSF TIme: " + dsfTime + " nanoseconds");
        System.out.println("---------------------------------------");
    }

    public void runMultipleTests() {
        System.out.println("Test small graph");
        Graph smallGraph = createRandomGraph(10, 15);
        runTraversals(smallGraph);
        runTraversals(smallGraph);
        printResults();

        System.out.println("Test medium graph");
        Graph mediumGraph = createRandomGraph(30, 35);
        runTraversals(mediumGraph);
        runTraversals(mediumGraph);
        printResults();

        System.out.println("Test large graph");
        Graph largeGraph = createRandomGraph(100, 110);
        runTraversals(largeGraph);
        runTraversals(largeGraph);
        printResults();
    }
}
