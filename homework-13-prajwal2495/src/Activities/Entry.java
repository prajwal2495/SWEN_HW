package Activities;

/**
 * @author Prajwal Krishna
 * Beginning of class Entry
 * @param <K>, generic type K depicting 'Key' value in a map
 * @param <V>, generic type V depicting 'Value' value in a map
 */
public class Entry<K, V> {
    private K key;
    private V value;

    /**
     * Constructor method Entry
     * Creates and object Entry class as key, value pairs
     * @param key, generic type K depicting 'Key' value in a map
     * @param value, generic type V depicting 'Value' value in a map
     */
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * method getKey()
     * @return key value of generic type K
     */
    public K getKey() {
        return key;
    }

    /**
     * method getValue()
     * @return value associated with key of generic type V
     */
    public V getValue() {
        return value;
    }
}
