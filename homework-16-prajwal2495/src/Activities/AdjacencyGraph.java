package Activities;

import java.util.*;

public class AdjacencyGraph<T> implements Graph<T> {
    private Map<T, Vertex<T>> vertices;

    public AdjacencyGraph() {
        vertices = new HashMap<>();
    }

    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public boolean contains(T value) {
        return vertices.containsKey(value);
    }

    @Override
    public void connectDirected(T value, T... values) {
        Vertex<T> vertex = vertices.get(value);
        for(T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
        }
    }

    @Override
    public void connectUndirected(T value, T... values) {
        Vertex<T> vertex = vertices.get(value);
        for(T neighborValue : values) {
            Vertex<T> neighbor = vertices.get(neighborValue);
            vertex.addNeighbor(neighbor);
            neighbor.addNeighbor(vertex);
        }
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public boolean breadthFirstSearch(T start, T end) {
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> visited = new HashSet<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while(queue.size() > 0) {
            Vertex<T> v = queue.poll();
            if(v == endVertex) {
                return true;
            } else {
                for(Vertex<T> neighbor : v.getNeighbors()) {
                    if(!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return false;
    }

    @Override
    public List<T> breadthFirstPath(T start, T end) {
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<>();
        Map<Vertex<T>, Vertex<T>> visited = new HashMap<>();

        queue.add(startVertex);
        visited.put(startVertex, null);

        while(queue.size() > 0) {
            Vertex<T> v = queue.poll();
            if(v == endVertex) {
                List<T> path = new LinkedList<>();
                Vertex<T> p = endVertex;
                while(p != null) {
                    path.add(0, p.getValue());
                    p = visited.get(p);
                }
                return path;
            } else {
                for(Vertex<T> neighbor : v.getNeighbors()) {
                    if(!visited.containsKey(neighbor)) {
                        visited.put(neighbor, v);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return null;
    }
}
