package activities;

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
    public boolean depthFirstSearch(T start, T end) {
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);
//
//        Queue<Vertex<T>> queue = new LinkedList<>();
        Set<Vertex<T>> visited = new HashSet<>();

//        queue.add(startVertex);
        visited.add(startVertex);

        visitDFS(startVertex,visited);

        return visited.contains(endVertex);
    }

    private void visitDFS(Vertex<T> vertex, Set<Vertex<T>> visited){
        for(Vertex<T> neighbors : vertex.getNeighbors()){
            if(!visited.contains(neighbors)){
                visited.add(neighbors);
                visitDFS(neighbors,visited);
            }
        }

    }


    @Override
    public List<T> depthFirstPath(T start, T end){
        Vertex<T> startVertex = new Vertex<>(start);
        Set<Vertex<T>> visited = new HashSet<>();

        visited.add(startVertex);


        return null;

    }

    private List<T> visitDFSPath(Vertex<T> vertex, Vertex<T> end, Set<Vertex<T>> visited){
        if(vertex == end){
            List<T> path = new LinkedList<>();
            path.add(vertex.getValue());
        }else{
            for(Vertex<T> neighbors : vertex.getNeighbors()){
                if(!visited.contains(neighbors)){
                    visited.add(neighbors);
                    List<T> path = visitDFSPath(neighbors,end,visited);
                    if(path != null){
                        path.add(0,vertex.getValue());
                        return path;
                    }
                }
            }
        }
        return null;
    }
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
