package util;

/**
 * An implementation of a set that uses a map to store the elements.
 * @param <T>
 */
public class MapSet<T> implements Set<T> {
    /**
     * The map used to store the elements.
     */
    private final Map<T,T> map;

    /**
     * Creates a map set that uses the specified map to store elements.
     *
     * @param map The map used to store elements.
     */
    public MapSet(Map<T,T> map) {
        this.map = map;
    }

    /**
     * Creates a map set that uses a {@link ChainingHashMap} to store
     * elements.
     */
    public MapSet() {
        this(new ChainingHashMap<>());
    }

    @Override
    public void add(T value) {
        if(!map.contains(value)) {
            map.put(value, value);
        }
    }

    @Override
    public void remove(T value) {
        map.remove(value);
    }

    @Override
    public boolean contains(T value) {
        return map.contains(value);
    }

    @Override
    public int size() {
        return map.size();
    }
}
