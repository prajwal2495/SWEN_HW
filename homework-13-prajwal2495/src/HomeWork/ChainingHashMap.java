package HomeWork;

/**
 * @author Prajwal Krishna
 * @param <K>
 * @param <V>
 */
public class ChainingHashMap<K,V> implements Map<K,V> {

    private final float THRESHOLD = 0.75f;
    private int size;
    private Object[] table;

    public ChainingHashMap() {
        this.size = 0;
        table = new Object[5];
    }

    @Override
    public void put(K key, V value) {
        rehash();
        int index = index(key);
        int searchIndex = index;

        Entry<K, V> entry = new Entry<>(key, value);
        if (this.table[index] == null) {
            this.table[index] = entry;
        } else {
            Entry<K, V> alreadyEntered = (Entry<K, V>) this.table[index];
            while (alreadyEntered.getNext() != null) {
                alreadyEntered = alreadyEntered.getNext();
            }
            alreadyEntered.setNext(entry);
        }
    }


    @Override
    @SuppressWarnings("unchecked")
    public V get(K key) {
        int index = index(key);

        Entry<K, V> alreadyEntered = (Entry<K, V>) this.table[index];

        if (alreadyEntered != null) {
            while (!alreadyEntered.getKey().equals(key) && alreadyEntered.getNext() != null) {
                alreadyEntered = alreadyEntered.getNext();
            }
            if(alreadyEntered.getKey().equals(key)) {
                return alreadyEntered.getValue();
            }
        }
        return null;
    }



    @Override
    public int size() {
        for (int i = 0; i < this.table.length; i++){
            if(this.table[i] != null){
                this.size++;
            }
        }
        return this.size;
    }

    private int index(K key) {
        int hashCode = key.hashCode();

        int index = hashCode % table.length;
        //System.out.println(index);

        index = Math.abs(index);

        // System.out.println(table.length + " % " + hashCode + " = " + index);

        return index;
    }

//    @SuppressWarnings("unchecked")
//    private boolean compareKey(K key, int index) {
//        Entry<K,V> entry = (Entry<K,V>)table[index];
//        return entry == null || entry.getKey().equals(key);
//    }

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
            this.size = 0;
            // rehash the entries
            for(int i=0; i<old.length; i++) {
                Entry<K,V> entry = (Entry<K,V>)old[i];
                if(entry != null) {
                    put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override
    public String toString() {
        int indexOfHashingTable = 0;
        StringBuilder chainingHashTableString = new StringBuilder();
        for(Object entries : this.table){
            if(entries == null){
                continue;
            }
            chainingHashTableString.append("\nList of data[")
                    .append(indexOfHashingTable)
                    .append("] = ")
                    .append(((Entry<?, ?>) entries).getValue());
            indexOfHashingTable++;

            Entry<?, ?> temp = ((Entry<?, ?>) entries).getNext();
            while(temp != null) {
                chainingHashTableString.append(" --> ");
                chainingHashTableString.append(temp.getValue());
                temp = temp.getNext();
            }
        }
        return chainingHashTableString.toString();
    }

    public static void main(String[] args) {
        ChainingHashMap<Integer,String> chainingHashMap = new ChainingHashMap<>();
        chainingHashMap.put(6,"Six");
        chainingHashMap.put(19,"nineteen");
        chainingHashMap.put(2,"two");
        chainingHashMap.put(3,"Three");
        chainingHashMap.put(7,"Seven");
        chainingHashMap.put(12,"Twelve");
        chainingHashMap.put(13,"Thirteen");
        chainingHashMap.put(14,"Fourteen");
        chainingHashMap.put(15,"Fifteen");
        chainingHashMap.put(16,"Sixteen");
        chainingHashMap.put(101,"one-oh-one");

        System.out.println(chainingHashMap.get(102));
        System.out.println(chainingHashMap.size());

        System.out.println(chainingHashMap.toString());
    }


}
