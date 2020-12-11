package Activities;

/**
 * @author Prajwal KRishna
 * @param <K>, generic type K depicting 'Key' value in a map
 * @param <V>, generic type V depicting 'Value' value in a map
 */
public class HashingMap<K,V> implements Map<K,V> {
    //Threshold value to resize the hashMap
    private final float THRESHOLD = 0.75f;

    private int size;
    private Object[] table;

    /**
     * Constructor HashingMap()
     * initialises the size to 0
     * initialises the table array
     */
    public HashingMap() {
        this.size = 0;
        table = new Object[2];
    }

    /**
     * method put()
     * used to rehash and insert an element into hashing table
     * @param key, Key value of the Hashmap that needs to inserted into hashing table
     * @param value, value associated with the key
     */
    @Override
    public void put(K key, V value) {
        rehash();
        int index = index(key);
        int searchIndex = index;

        while(!compareKey(key, searchIndex)) {
            searchIndex = (searchIndex + 1) % table.length;
            if(searchIndex == index) {
                // table is full!
                return;
            }
        }
        table[searchIndex] = new Entry<>(key, value);
        size++;
    }

    /**
     * method get()
     * used to retrieve a specific value of the given key from the hashing table
     * @param key, key value which needs to retrieved from the hashing table
     * @return value associated with the key
     */
    @Override
    @SuppressWarnings("unchecked")
    public V get(K key) {
        int index = index(key);
        int searchIndex = index;
        while(!compareKey(key, searchIndex)) {
            searchIndex = (searchIndex + 1) % table.length;
            if(searchIndex == index) {
                // this should never happen...
                return null;
            }
        }

        Entry<K,V> entry = (Entry<K, V>) table[searchIndex];
        if(entry == null) {
            return null;
        } else {
            return entry.getValue();
        }
    }

    /**
     * method size()
     * used to get the size of the hashing table
     * @return the size or the number of key, value pairs in the hashing table
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * method index()
     * used to generate an index to store the key value pair in the hashing table
     * @param key, takes the key and generates an index by modding the key value with the hashing table length
     * @return an appropriate index value
     */
    private int index(K key) {
        int hashCode = key.hashCode();

        int index = hashCode % table.length;

        index = Math.abs(index);

        // System.out.println(table.length + " % " + hashCode + " = " + index);

        return index;
    }

    /**
     * method compareKey()
     * used to check whether a given index already holds a value or not
     * @param key a key value that could be present in the hashing table
     * @param index an index that could be holding null or some key,value pair in the hashing table
     * @return a boolean true or false depending on whether the key and index are already present in the hashing table
     */
    @SuppressWarnings("unchecked")
    private boolean compareKey(K key, int index) {
        Entry<K,V> entry = (Entry<K,V>)table[index];
        return entry == null || entry.getKey().equals(key);
    }

    /**
     * method rehash()
     * used to check whether the sparsity is greater than the threshold value
     * if that is the case then increase the size of the hashing table by twice
     */
    @SuppressWarnings("unchecked")
    private void rehash() {
        float sparsity = (float)size / table.length;
        // if the table is too full
        if(sparsity > THRESHOLD) {
            System.out.println("rehashing: " +table.length + ", " + size);
            // store the old table
            Object[] old = table;
            // make a new table
            table = new Object[old.length * 2];

            // rehash the entries
            for(int i=0; i<old.length; i++) {
                Entry<K,V> entry = (Entry<K,V>)old[i];
                if(entry != null) {
                    put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
