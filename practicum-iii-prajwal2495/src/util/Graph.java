package util;

import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.*;

/**
 * An class that implements a graph data structure.
 *
 * @param <T> The type parameter indicating the type of values stored by the
 *           vertices in the graph.
 */
public class Graph<T> {
    /**
     * A {@link Map} of values to vertices.
     */
    private final Map<T, Vertex<T>> vertices;

    /**
     * Creates a new, empty graph.
     */
    public Graph() {
        vertices = new HashMap<>();
    }

    /**
     * Returns true if the graph contains the specified value.
     *
     * @param value The value of interest.
     *
     * @return True if the value is in the graph; false otherwise.
     */
    public boolean contains(T value) {
        return vertices.containsKey(value);
    }

    /**
     * Adds the specified value to the graph.
     *
     * @param value The value to add to the graph.
     */
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    /**
     * Adds all of the specified values to the graph.
     *
     * @param values The values to add to the graph.
     */
    public void addValues( T ... values) {
        for(T value : values) {
            addValue(value);
        }
    }

    /**
     * Establishes a directed connection between the first value and all of
     * the other values.
     *
     * @param value The first value.
     * @param values The values to which the first value should be connected.
     */
    public void connectDirected(T value, T ... values) {
        Vertex<T> vertex = vertices.get(value);

        for(T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(value);
            vertex.addNeighbor(neighbor);
        }
    }

    /**
     * Establishes an undirected connection between the first value and all of
     * the other values.
     *
     * @param value The first value.
     * @param values The values to which the first value should be connected.
     */
    public void connectUndirected(T value, T ... values) {
        Vertex<T> vertex = vertices.get(value);

        for(T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
            neighbor.addNeighbor(vertex);
        }
    }

    /**
     * Determines whether a path exists between the two values in the graph.
     *
     * @param startValue The value from which to start searching.
     * @param endValue The value at which the path should end.
     *
     * @return True if a path exists between the start and end values. False
     * otherwise.
     */
    public boolean breadthFirstSearch(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> seen = new HashSet<>();

        queue.add(start);
        seen.add(start);

        while(queue.size() > 0) {
            Vertex<T> next = queue.poll();
            if(next == end) {
                return true;
            } else {
                for(Vertex<T> neighbor : next.getNeighbors()) {
                    if(!seen.contains(neighbor)) {
                        seen.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        return false;
    }

    /**
     * Returns the path of values between the specified start and end, if it
     * exists in the graph.
     *
     * @param startValue The starting value.
     * @param endValue The ending value.
     *
     * @return A path of values from start to end, if it exists. Otherwise,
     * returns null.
     */
    public List<T> breadthFirstPath(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        if(start != null && end != null) {
            Queue<Vertex<T>> queue = new LinkedList<>();
            Map<Vertex<T>, Vertex<T>> seen = new HashMap<>();

            queue.add(start);
            seen.put(start, null);

            while (queue.size() > 0) {
                Vertex<T> next = queue.poll();
                if (next == end) {
                    return makePath(end, seen);
                } else {
                    for (Vertex<T> neighbor : next.getNeighbors()) {
                        if (!seen.containsKey(neighbor)) {
                            seen.put(neighbor, next);
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Performs a depth first search to determine whether or not a path exists
     * between the start value and end value in this graph.
     *
     * @param startValue The value at which the path should start.
     * @param endValue The value at which the path should end.
     *
     * @return True if the path exists, false otherwise.
     */
    public boolean depthFirstSearch(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Set<Vertex<T>> visited = new HashSet<>();
        visited.add(start);

        visitDFS(start, visited);

        return visited.contains(end);
    }

    /**
     * Builds a path using a depth first search, if it exists.
     *
     * @param startValue The value at which the path should start.
     * @param endValue The value at which the path should end.
     *
     * @return The path as a {@link List} of values if it exists. Null
     * otherwise.
     */
    public List<T> depthFirstPath(T startValue, T endValue) {
        Vertex<T> start = vertices.get(startValue);
        Vertex<T> end = vertices.get(endValue);

        Set<Vertex<T>> visited = new HashSet<>();
        visited.add(start);

        return makeDFSPath(start, end, visited);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Graph{");
        for(Vertex<T> vertex : vertices.values()) {
            builder.append("\n  ");
            builder.append(vertex.getValue());
            builder.append(": ");
            builder.append(vertex.getNeighbors());
        }
        builder.append("\n}");
        return builder.toString();
    }

    /**
     * A helper function that, given a map of vertices and their predecessors
     * along a path that has been found, returns the path as a list of values.
     * The start value is not needed because it is the only value in the map
     * with a null predecessor.
     *
     * @param end The last vertex in the path.
     * @param seen The map of vertices and their predecessors along the path.
     *
     * @return The path from start to end.
     */
    private List<T> makePath(Vertex<T> end, Map<Vertex<T>, Vertex<T>> seen) {

        List<T> path = new LinkedList<>();

        Vertex<T> next = end;
        while(next != null) {  // null means we found the start
            path.add(0, next.getValue());
            next = seen.get(next);
        }

        return path;
    }

    /**
     * Recursively visits the neighbors of the specified vertex that have not
     * already been visited.
     *
     * @param vertex The vertex of which the neighbors should be visited.
     * @param visited The {@link Set} of previously visited vertices.
     */
    private void visitDFS(Vertex<T> vertex, Set<Vertex<T>> visited) {
        for(Vertex<T> neighbor : vertex.getNeighbors()) {
            if(!visited.contains(neighbor)) {
                visited.add(neighbor);
                visitDFS(neighbor, visited);
            }
        }
    }

    /**
     * Attempts to make a path from the start vertex to the end vertex.
     *
     * @param start The start vertex.
     * @param end The end vertex.
     * @param visited The {@link Set} of visited vertices.
     *
     * @return A path containing the values between start and end, or null if
     * no such path exists.
     */
    private List<T> makeDFSPath(Vertex<T> start, Vertex<T> end,
                                Set<Vertex<T>> visited) {
        if(start == end) {
            List<T> path = new LinkedList<>();
            path.add(start.getValue());
            return path;
        } else {
            for(Vertex<T> neighbor : start.getNeighbors()) {
                if(!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    List<T> path = makeDFSPath(neighbor, end, visited);
                    if(path != null) {
                        path.add(0, start.getValue());
                        return path;
                    }
                }
            }
        }
        return null;
    }
}
