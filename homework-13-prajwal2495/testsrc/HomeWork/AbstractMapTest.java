package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Prajwal Krishna
 * beginning of class AbstractMapTest
 * @param <K>, generic type K depicting 'Key' value in a map
 * @param <V>, generic type V depicting 'Value' value in a map
 */
public abstract class AbstractMapTest<K,V> {
    public abstract Map makeMap();


    /**
     * method testSize()
     * tests whether the number of elements in the chained hash table is correct or not.
     */
    @Test
    public void testSize(){
        //setup
        Map<Integer,String> testingSize = makeMap();

        testingSize.put(1,"one");
        testingSize.put(2,"two");
        testingSize.put(3,"three");
        testingSize.put(4,"four");
        testingSize.put(5,"five");
        testingSize.put(6,"six");

        //invoke
        int expected = 6;
        int actual = testingSize.size();

        //assert
        assertEquals(expected,actual);
    }

    /**
     * method testGet()
     * tests whether the get function is retrieving the correct value associated with the given key
     */
    @Test
    public void testGet(){
        //setup
        Map<Integer,String> testingGet =  makeMap();

        testingGet.put(1,"one");
        testingGet.put(2,"two");
        testingGet.put(3,"three");
        testingGet.put(4,"four");
        testingGet.put(5,"five");
        testingGet.put(6,"six");

        //invoke
        String expected = null;
        String actual = testingGet.get(7);

        //assert
        assertEquals(expected,actual);
    }

    /**
     * method testingPut()
     * tests whether the elements are being added to the chained hash table at the right index or not.
     */
    @Test
    public void testingPut(){
        //setup
        Map<Integer,String> testingPut = makeMap();
        testingPut.put(1,"one");
        testingPut.put(2,"two");
        testingPut.put(3,"three");
        testingPut.put(4,"four");
        testingPut.put(5,"five");
        testingPut.put(6,"six");

        //invoke
        String expected = "six" ;
        String actual = testingPut.get(6);

        //assert
        assertEquals(expected,actual);
    }

}
