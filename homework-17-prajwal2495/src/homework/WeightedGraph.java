package homework;

import java.util.List;

/**
 * @author Prajwal Krishna
 * Begininning of interface WeightedGraph
 * @param <T> generic type interface
 */
public interface WeightedGraph<T> {

    void addValue(T value);

     void connect(T value1, T value2, int weight);

     List<PathTuple> dijkstrasShortestPath(T start, T end) throws Exception;

}
