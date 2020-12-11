package Activities;

/**
 * @author Prajwal Krishna
 * @param <K> Key value of the map
 * @param <V> value associated with the key
 */
public interface Map<K,V> {

    void put(K key, V value);

    V get(K key);

    int size();
}
