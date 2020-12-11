package activities.weighted;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Prajwal Krishna
 * Begininning of class WeightedAdjacencyGraph
 * @param <T> generic type class
 */

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T>  {
    private final Map<T, Vertex<T>> vertices;

    /**
     * constructor WeightedAdjacencyGraph
     * used to create a graph
     */
    public WeightedAdjacencyGraph() {
        this.vertices = new HashMap<>();
    }

    /**
     * method addValue()
     * used to add typically a vertex into the graph
     * @param value generic type value
     */
    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value,vertex);
    }

    /**
     * method connect()
     * used to make connections on the graph
     * @param value1 vertex
     * @param value2 vertex
     * @param weight cost
     */
    @Override
    public void connect(T value1, T value2, int weight) {
        Vertex<T> from = vertices.get(value1);
        Vertex<T> to = vertices.get(value2);
        from.addNeighbor(to, weight);

    }

    @Override
    public List<T> dijkstrasShortestPath(T start, T end) {
        return null;
    }
}
