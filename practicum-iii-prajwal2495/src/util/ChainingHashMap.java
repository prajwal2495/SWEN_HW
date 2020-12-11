package util;

import java.util.ArrayList;
import java.util.List;

/**
 * A map implementation that uses chaining to handle collisions.
 *
 * @param <K>
 * @param <V>
 */
public class ChainingHashMap<K,V> implements Map<K,V> {
    /**
     * Determines when it is time to resize the array.
     */
    private static final float THRESHOLD = 0.75f;

    /**
     * The array of chains.
     */
    private List<Entry<K,V>>[] array;

    /**
     * The number of entries in map.
     */
    private int size;

    @SuppressWarnings("unchecked")
    public ChainingHashMap() {
        array = (List<Entry<K,V>>[])new List[8];
        size = 0;
    }

    @Override
    public void put(K key, V value) {
        checkLoadFactor();
        Entry<K,V> entry = find(key);
        if(entry != null) {
            entry.setKey(key);
            entry.setValue(value);
        } else {
            add(new Entry<>(key, value));
            size++;
        }
    }

    @Override
    public V get(K key) {
        Entry<K,V> entry = find(key);
        return entry != null ? entry.getValue() : null;
    }

    @Override
    public V remove(K key) {
        Entry<K,V> entry = find(key, true);
        if(entry != null) {
            size--;
            return entry.getValue();
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(K key) {
        return find(key) != null;
    }

    /**
     * Returns the index for the specified key based on the key's hash code
     * and the size of the array.
     *
     * @param key The key.
     *
     * @return The index for the key.
     */
    private int index(K key) {
        int hashCode = key.hashCode();
        int index = hashCode % array.length;
        // check for negative values
        return index < 0 ? -index : index;
    }

    /**
     * Returns the entry for the specified key, if it exists.
     *
     * @param key The key.
     *
     * @return The entry for the specified key.
     */
    private Entry<K,V> find(K key) {
        return find(key, false);
    }

    /**
     * Returns the entry for the specified key, if it exists.
     *
     * @param key The key.
     * @param remove Indicates whether or not the entry should be removed.
     *
     * @return The entry for the specified key.
     */
    private Entry<K,V> find(K key, boolean remove) {
        int index = index(key);
        List<Entry<K,V>> chain = array[index];
        if(chain != null) {
            for(int i = 0; i < chain.size(); i++) {
                Entry<K, V> entry = chain.get(i);
                if (entry.getKey().equals(key)) {
                    if (remove) {
                        chain.remove(i);
                    }
                    return entry;
                }
            }
        }

        return null;
    }

    /**
     * Adds the specified entry to the correct chain in the array.
     *
     * @param entry The entry to add.
     */
    private void add(Entry<K,V> entry) {
        int index = index(entry.getKey());
        List<Entry<K,V>> chain = array[index];
        if(chain == null) {
            chain = new ArrayList<>();
            array[index] = chain;
        }
        chain.add(entry);
    }

    /**
     * Checks the current load factor in the array. If it is over the
     * threshold, the array is resized and the entries rehashed.
     */
    @SuppressWarnings("unchecked")
    private void checkLoadFactor() {
        float loadFactor = (float)size / array.length;
        if(loadFactor >= THRESHOLD) {
            List<Entry<K,V>>[] old = array;
            array = (List<Entry<K,V>>[])new List[array.length * 2];

            // rehash the values in every chain
            for(List<Entry<K,V>> chain : old) {
                if(chain != null) {
                    for(Entry<K,V> entry : chain) {
                        add(entry);
                    }
                }
            }
        }
    }
}
