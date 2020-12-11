package homework;

public class PathTuple<T> {
    private Vertex<T> predecessor;
    private int shortestDistance;

    public PathTuple(Vertex<T> predecessor, int shortestDistance) {
        this.predecessor = predecessor;
        this.shortestDistance = shortestDistance;
    }

    public Vertex<T> getPredecessor() {
        return predecessor;
    }

    public int getShortestDistance() {
        return shortestDistance;
    }

    public void setPredecessor(Vertex<T> predecessor) {
        this.predecessor = predecessor;
    }

    public void setShortestDistance(int shortestDistance) {
        this.shortestDistance = shortestDistance;
    }

    public int getDistance() {
        return 0;
    }

    @Override
    public String toString() {
        return "PathTuple{" +
                "predecessor=" + (predecessor.getValue() == null ? "nothing" : predecessor.getValue()) +
                ", shortestDistance=" + shortestDistance +
                '}';
    }
}