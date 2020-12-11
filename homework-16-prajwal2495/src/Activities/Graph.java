package Activities;

import java.util.List;

public interface Graph<T> {
    void addValue(T value);

    boolean contains(T value);

    void connectDirected(T value, T ... values);

    void connectUndirected(T value, T ... values);

    int size();

    boolean breadthFirstSearch(T start, T end);

    List<T> breadthFirstPath(T start, T end);
}
