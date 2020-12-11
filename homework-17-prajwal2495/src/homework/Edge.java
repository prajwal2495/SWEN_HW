package homework;

/**
 * @author Prajwal Krishna
 * Begininning of class Edge
 * @param <T> generic type class
 */
public class Edge<T> {

    private final Vertex<T> from;
    private final Vertex<T> to;
    private final int weight;

    public Edge(){
        this.from = null;
        this.to = null;
        this.weight = 0;
    }

    /**
     * Constructor of class Edge
     * Takes two vertices and a weight as parameter to create an object
     * @param from, Source vertex
     * @param to, destination vertex
     * @param weight, cost associated
     */
    public Edge(Vertex<T> from, Vertex<T> to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    /**
     * Method getFrom()
     * to get the value of the source vertex
     * @return an Vertex object
     */
    public Vertex<T> getFrom() {
        return from;
    }

    /**
     * method getTo()
     * to get the values of the destination vertex
     * @return an vertex object
     */
    public Vertex<T> getTo() {
        return to;
    }

    /**
     * method getWeight()
     * to get the cost
     * @return integer, which is the cost associated.
     */
    public int getWeight() {
        return weight;
    }
}
