package algorithm.complexity.graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SimulateDijkstra {
    public void simulate() {
        List<Vertex> nodes = Arrays.asList(
                new Vertex("A", "A"), //0
                new Vertex("B", "B"), //1
                new Vertex("C", "C"), //2
                new Vertex("D", "D"), //3
                new Vertex("E", "E")  //4
        );

        List<Edge> edges = Arrays.asList(
                new Edge("A->B", nodes.get(0), nodes.get(1), 6),
                new Edge("A->D", nodes.get(0), nodes.get(3), 1),
                new Edge("D->B", nodes.get(3), nodes.get(1), 2),
                new Edge("D->E", nodes.get(3), nodes.get(4), 1),
                new Edge("E->B", nodes.get(4), nodes.get(1), 2),
                new Edge("E->C", nodes.get(4), nodes.get(2), 5),
                new Edge("B->C", nodes.get(1), nodes.get(2), 5)
        );

        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);


        long startTime = System.nanoTime();
        dijkstra.execute(nodes.get(0));
        long endTime = System.nanoTime();

        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(2));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            if (i == path.size() - 1) {
                result.append(path.get(i));
            } else {
                result.append(path.get(i)).append("->");
            }
        }

        long duration = (endTime - startTime);
        System.out.println("--------------------------------------------------");
        System.out.println("--- " + "O (E log V)");
        System.out.println("--- " + "Dijkstra Algorithm (SPA)" + " result:   " + result.toString());
        System.out.println("--- " + "Dijkstra Algorithm (SPA)" + " duration: " + (double)duration/1000000+ "ms");
        System.out.println("--------------------------------------------------");
    }
}
