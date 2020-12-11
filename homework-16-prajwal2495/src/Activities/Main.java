package Activities;

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

        System.out.println("Breadth first search A-C: " +
                graph.breadthFirstSearch("A", "C"));
        System.out.println("Breadth first search A-G: " +
                graph.breadthFirstSearch("A", "G"));

        System.out.println("Breadth first path A-C: " +
                graph.breadthFirstPath("A", "C"));
        System.out.println("Breadth first path A-G: " +
                graph.breadthFirstPath("A", "G"));


    }
}
