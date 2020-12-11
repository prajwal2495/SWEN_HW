package Activities;

import java.util.HashSet;
import java.util.Set;

class Vertex<T> {

    private T value;
    private Set<Vertex<T>> neighbors;

    Vertex(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    T getValue() {
        return value;
    }

    void addNeighbor(Vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    Set<Vertex<T>> getNeighbors() {
        return neighbors;
    }
}
