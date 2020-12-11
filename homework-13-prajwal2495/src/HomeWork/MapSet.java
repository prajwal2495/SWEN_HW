package HomeWork;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prajwal Krishna
 * @param <E> a generic type E that will be added to the set based on satisfying several conditions
 */
public class MapSet<E> implements Set<E> {

    private HashMap<Object, Object> map = null;

    /**
     * constructor MapSet()
     * creates a new HashMap to implement it as a set
     */
    public MapSet() {
        map = new HashMap<>();
    }

    /**
     * method add()
     * used to add an element into the set
     * will check if the element is already present in the set, if not adds the element else ignored
     * @param element, an element of type E
     */
    @Override
    public void add(E element) {
        if (element.equals(map.get(element))) {
            System.out.println("Element " + element + " already present");
            return;
        }
        map.put(element, element);
    }

    /**
     * method remove()
     * used to remove an element from the set, if present
     * @param element, element off type E that needs to removed
     */
    @Override
    public void remove(E element) {
        if (element.equals(map.get(element))) {
            map.remove(element);
            return;
        }
        System.out.println("Element " + element + " does not exist");

    }

    /**
     * method contains()
     * used to check whether the given element is present in the set or not
     * returns a boolean value based on the availability of the element
     * @param element, an element of type E that needs to searched in the set
     * @return returns a boolean value based on the availability of the element
     */
    @Override
    public boolean contains(E element) {
        return element.equals(map.get(element));
    }

    /**
     * method size()
     * used to calculate how many elements are there in the set
     * @return an integer depicting the size of the set
     */
    protected int size() {
        int size = 0;
        for(Map.Entry eachElement : map.entrySet()){
            if(eachElement != null){
                size++;
            }
        }
        return size;
    }


    public static void main(String[] args) {
        MapSet<Integer> integerSet = new MapSet<>();
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.remove(3);
        integerSet.remove(4);
        System.out.println(integerSet.contains(2));
        System.out.println(integerSet.contains(3));
        System.out.println(integerSet.size());
    }
}
