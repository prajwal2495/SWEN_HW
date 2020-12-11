package homework;

import java.util.HashSet;

import java.util.Set;


/**
 * @author Prajwal Krishna
 * Begininning of class Vertex
 * @param <T> generic type class
 */
class Vertex<T> {

    private T value;
    private Set<Edge<T>> edges;

    /**
     * constructor of vertex class
     * @param value value of the vertex
     */
    public Vertex(T value) {
        this.value = value;
        edges = new HashSet<>();
    }

    /**
     * method getValue()
     * @return the value of the vertex
     */
    public T getValue() {
        return value;
    }

    /**
     * method addNeighbor()
     * used to add Neighboring vertex to a map
     * @param neighbor Neighboring vertex
     * @param weight cost
     */
    public void addNeighbor(Vertex<T> neighbor, int weight) {
        Edge<T> edge = new Edge<>(this, neighbor, weight);
        edges.add(edge);
    }

    /**
     * method getNeighbors
     * used to get all the unique Neighbors of a given vertex
     * @return a set of Neighbors
     */
    public Set<Vertex<T>> getNeighbors() {
        Set<Vertex<T>> neighbors = new HashSet<>();
        for (Edge<T> edge : edges) {
            neighbors.add(edge.getTo());
        }
        return neighbors;
    }


    /**
     * method getEdges()
     * used to get all the edges associated with the vertex
     * @return set of edges
     */
    public Set<Edge<T>> getEdges() {
        return edges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex<?> vertex = (Vertex<?>) o;

        if (value != null ? !value.equals(vertex.value) : vertex.value != null) return false;
        return edges != null ? edges.equals(vertex.edges) : vertex.edges == null;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (edges != null ? edges.hashCode() : 0);
        return result;
    }
}
