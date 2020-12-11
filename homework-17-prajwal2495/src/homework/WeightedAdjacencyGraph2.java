package homework;

import java.util.*;

public class WeightedAdjacencyGraph2<T> implements WeightedGraph<T> {

    private final Map<T, Vertex<T>> vertices;

    public WeightedAdjacencyGraph2() {
        vertices = new HashMap<>();
    }

    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value, vertex);
    }

    @Override
    public void connect(T value1, T value2, int weight) {
        Vertex<T> from = vertices.get(value1);
        Vertex<T> to = vertices.get(value2);
        from.addNeighbor(to, weight);
    }


    private Vertex<T> findClosestNeighbor(Vertex<T> vertex){
        int smallest = Integer.MAX_VALUE;
        Vertex<T> returnVertex = null;
        for(Edge<T> edge : vertex.getEdges()){
            if(edge.getWeight() < smallest){
                smallest = edge.getWeight();
                returnVertex = edge.getTo();
            }
        }
        return returnVertex;
    }

    @Override
    public List  dijkstrasShortestPath(T start, T end) {
        Vertex<T> startVertex = vertices.get(start);
        Vertex<T> endVertex = vertices.get(end);

        Queue<Vertex<T>> queue = new LinkedList<>();

        //List<Vertex<T>> vertexPath = new LinkedList<>();

        Set<Vertex<T>> visited = new HashSet<>();

        //Vertex<T> prev = vertices.get(start);
        //Set<Vertex<T>> visitedSet = new HashSet<>();

        Map<Vertex<T>, PathTuple<T>> pathMap = new HashMap<>();

        PathTuple<T> startTuple = new PathTuple<>(null, 0);
        pathMap.put(startVertex, startTuple);

        for (Vertex<T> v : vertices.values()) {
            if (v != startVertex) {
                PathTuple<T> tuple = new PathTuple<>(null, Integer.MAX_VALUE);
                pathMap.put(v, tuple);
            }
        }

        queue.add(startVertex);

        while (queue.size() > 0) {

            Vertex<T> vertex = queue.poll();

            if (!visited.contains(vertex)) {

                visited.add(vertex);

                for (Edge<T> edge : vertex.getEdges()) {

                    Vertex<T> dest = vertices.get(edge.getTo().getValue());
                    Vertex<T> source = vertices.get(edge.getFrom().getValue());

                    //System.out.println(dest.getValue());
                    //System.out.println(source.getValue());
                    //System.exit(1);


                    PathTuple<T> prevTuple = pathMap.get(source);

                    //System.out.println(prevTuple.toString());
                    //System.exit(1);

                    int running = prevTuple.getDistance();
                    //System.out.println("Running"+running);

                    PathTuple<T> nextTuple = new PathTuple<>(source, running + edge.getWeight());

                    //System.out.println(nextTuple.toString());
                    //System.exit(1);

                    pathMap.put(dest, nextTuple);
                    //System.out.println(dest.getValue() + "  " +pathMap.get(dest).toString());

                    queue.add(dest);
                }
            }
        }


        List<Vertex<T>> path = new ArrayList<>();
        Queue<Vertex<T>> endQueue = new LinkedList<>();
        endQueue.add(endVertex);
        //Map<Vertex<T>, PathTuple<T>> pathMap = new HashMap<>();

        while(endQueue.size() > 0){
            Vertex<T> destination = endQueue.poll();
            if(destination.getValue().equals(startVertex.getValue())){
                path.add(startVertex);
                return path;
            }
            PathTuple<T> predecessorPathTuple = pathMap.get(destination);
            path.add(predecessorPathTuple.getPredecessor());
            endQueue.add(predecessorPathTuple.getPredecessor());
        }
        return path;
    }
}