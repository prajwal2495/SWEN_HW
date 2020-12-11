package util;

import java.util.HashSet;
import java.util.Set;

/**
 * Represents a single vertex in a graph.
 *
 * @param <T> The type of value held by the vertex.
 */
public class Vertex<T> {
    /**
     * The value.
     */
    private T value;

    /**
     * The set of neighboring vertices, to which this vertex is connected by
     * an edge.
     */
    private Set<Vertex<T>> neighbors;

    /**
     * Creates a new vertex with the specified value.
     *
     * @param value The value stored in this vertex.
     */
    public Vertex(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    /**
     * Returns the value inside this vertex.
     *
     * @return The value inside this vertex.
     */
    public T getValue() {
        return value;
    }

    /**
     * Addes a directed edge between this vertex and the specified neighbor.
     *
     * @param neighbor The new neighbor.
     */
    public void addNeighbor(Vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    /**
     * Returns the neighboring vertices.
     *
     * @return The {@link Set} of neighboring vertices.
     */
    public Set<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return value != null ? value.toString() : "null";
    }
}
