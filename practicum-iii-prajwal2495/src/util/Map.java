package util;

/**
 * The interface for a map.
 *
 * @param <K> The key type.
 * @param <V> The value type.
 */
public interface Map<K,V> {
    /**
     * Adds a key value pair to the map.
     *
     * @param key The key.
     * @param value The value.
     */
    void put(K key, V value);

    /**
     * Returns the value associated with the specified key.
     *
     * @param key The key used to fetch the value.
     * @return The value associated with the key, or null.
     */
    V get(K key);

    /**
     * Removes and returns the specified value from the map.
     *
     * @param key The key used to fetch the value.
     *
     * @return The value associated with the key, or null.
     */
    V remove(K key);

    /**
     * Returns the number of key/value pairs in the map.
     *
     * @return The number of key/value pairs in the map.
     */
    int size();

    /**
     * Returns true if the specified key is in the map.
     *
     * @param key The key.
     *
     * @return True if the key is in the map, false otherwise.
     */
    boolean contains(K key);
}
