package HomeWork;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * beginning of class Maptest, child class of MapSet
 */
class MapSetTest extends MapSet{

    /**
     * method testAdd
     * tests whether all the items are pushed and also nly unique items are maintained in the set
     */
    @Test
    public void testAdd(){
        MapSet<Integer> set = new MapSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        int expected = 3;
        int actual = set.size();

        assertEquals(expected,actual);

    }


    /**
     * method testRemove()
     * tests whether the given element is deleted from the set or not
     */
    @Test
    public void testRemove(){
        MapSet<Integer> set = new MapSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.remove(4);

        int expected = 3;
        int actual = set.size();

        assertEquals(expected,actual);

    }

    /**
     * method testContains()
     * tests whether the passed element is present in the set or not
     */
    @Test
    public void testContains(){
        MapSet<Integer> set = new MapSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        boolean expectedTrue = true ;
        boolean actual = set.contains(2);

        assertEquals(expectedTrue,actual);

        boolean expectedFalse = false ;
        actual = set.contains(12);

        assertEquals(expectedFalse,actual);
    }
}