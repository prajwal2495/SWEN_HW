package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * beginning of class ChainingHashMapTest, child class of AbstractMapTest
 */
class ChainingHashMapTest extends AbstractMapTest {

    /**
     * method makeMap()
     * helps in creating a Map object referencing to the ChainingHashMap class
     * @return an object of Map class with key being an Integer class and value being a String
     */
    @Override
    public Map makeMap() {
        Map<Integer,String> testMap = new ChainingHashMap<>();
        return testMap;
    }

    /**
     * method testSize()
     * tests whether the number of elements in the chained hash table is correct or not.
     */
    @Test
    public void testSize(){
        //setup
        Map<Integer,String> chainingHashMap = makeMap();

        chainingHashMap.put(6,"Six");
        chainingHashMap.put(2,"two");
        chainingHashMap.put(3,"Three");
        chainingHashMap.put(7,"Seven");
        chainingHashMap.put(12,"Twelve");
        chainingHashMap.put(13,"Thirteen");
        chainingHashMap.put(14,"Fourteen");
        chainingHashMap.put(15,"Fifteen");
        chainingHashMap.put(16,"Sixteen");
        chainingHashMap.put(101,"one-oh-one");

        //invoke
        int expected = 5;
        int actual = chainingHashMap.size();

        //assert
        assertEquals(expected,actual);
    }
}