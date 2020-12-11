package activities;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new AdjacencyGraph<>();
        graph.addValue("A");
        graph.addValue("B");
        graph.addValue("C");
        graph.addValue("D");
        graph.addValue("E");
        graph.addValue("F");
        graph.addValue("G");

        graph.connectUndirected("A", "B");
        graph.connectUndirected("C", "D");
        graph.connectDirected("D", "A");
        graph.connectDirected("B", "C");

        graph.connectUndirected("E", "F", "G");
        graph.connectDirected("G", "F");

        System.out.println("Depth first search A-C: " +
                graph.depthFirstSearch("A", "C"));
        System.out.println("Depth first search A-G: " +
                graph.depthFirstSearch("A", "G"));



    }
}
