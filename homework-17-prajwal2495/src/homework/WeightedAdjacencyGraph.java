package homework;

import java.util.*;

/**
 * @author Prajwal Krishna
 * Begininning of class WeightedAdjacencyGraph
 * @param <T> generic type class
 */

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {
    private final Map<T, Vertex<T>> vertices;
    private Set<Vertex<T>> settledNodes;
    private Set<Vertex<T>> unSettledNodes;
    private Map<Vertex<T>,Integer> distancesBetweenNodes;
    private Map<Vertex<T>, Vertex<T>> predecessors;

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

    /**
     * used to find the shortest distance with minimal cost using dijkstras algorithm
     * @param start start vertex
     * @param end destination vertex
     * @return a path
     */
    @Override
    public List dijkstrasShortestPath(T start, T end)  {
        Vertex<T> origin = new Vertex<>(start);
        Vertex<T> destination = new Vertex<>(end);
        List<Vertex<T>> path;

        settledNodes = new HashSet<>();
        unSettledNodes = new HashSet<>();
        distancesBetweenNodes = new HashMap<>();
        predecessors = new HashMap<>();

        distancesBetweenNodes.put(origin,0);
        unSettledNodes.add(origin);

        while(unSettledNodes.size() > 0){
            Vertex<T> minimumWeightedVertex = getMinimum(unSettledNodes);
            settledNodes.add(minimumWeightedVertex);
            unSettledNodes.remove(minimumWeightedVertex);
            findMinimumDistance(minimumWeightedVertex);
        }
        path = getPath(destination);
        return path;

    }

    private Vertex<T> getMinimum(Set<Vertex<T>> unSettledNodes) {
        Vertex<T> min = null;
        for(Vertex<T> vertex : unSettledNodes){
            if(min == null) {
                min = vertex;
            }else{
                if(getShortestDistance(vertex) < getShortestDistance(min)){
                    min = vertex;
                }
            }
        }
        return min;
    }

    private int getShortestDistance(Vertex<T> target) {
        Vertex<T> t = vertices.get(target.getValue());
        Integer minDistance = distancesBetweenNodes.get(t);
        if(minDistance == null){
            return Integer.MAX_VALUE;
        }else{
            return minDistance;
        }
    }


    private void findMinimumDistance(Vertex<T> minimumWeightedVertex)  {
        Vertex<T> mwv = vertices.get(minimumWeightedVertex.getValue());
        Set<Vertex<T>> neighboringNodes = mwv.getNeighbors();

        for(Vertex<T> target : neighboringNodes){
            if(getShortestDistance(target) > getShortestDistance(mwv) + getDistance(mwv, target)){
                distancesBetweenNodes.put(target,getShortestDistance(mwv) + getDistance(mwv, target));
                predecessors.put(target,mwv);
                unSettledNodes.add(target);
            }
        }
    }



    private int getDistance(Vertex<T> minimumWeightedVertex, Vertex<T> target)  {

        Vertex<T> mwv = vertices.get(minimumWeightedVertex.getValue());
        Vertex<T> t = vertices.get(target.getValue());
        Set<Edge<T>> edges = mwv.getEdges();
        edges.addAll(t.getEdges());

        for(Edge<T> tEdge : edges){
            if(tEdge.getTo().getValue().equals(mwv.getValue()) && tEdge.getTo().getValue().equals(t.getValue())){
                return tEdge.getWeight();
            }
        }
        return Integer.MAX_VALUE;
    }

    private List<Vertex<T>> getPath(Vertex<T> destination){
        List<Vertex<T>> path = new LinkedList<>();
        Vertex<T> vertex = destination;

        if(predecessors.get(vertex) == null){
            System.out.println("destination doesn't exist");
            return null;
        }
        path.add(vertex);
        while(predecessors.get(vertex) != null){
            vertex = predecessors.get(vertex);
            path.add(vertex);
        }

        Collections.reverse(path);
        return path;

    }



}