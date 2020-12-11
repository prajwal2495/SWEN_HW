package HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Prajwal Krishna
 * Beginning of class PokemonTest
 */
class PokemonTest {

    /**
     * method testEquals()
     * used to check the working of the overridden equals method
     */
    @Test
    public void testEquals(){
        Pokemon pikachu = new Pokemon("Pikachu",25);
        Pokemon raichu = new Pokemon("Raichu", 26);

        boolean expected = false;
        boolean actual = pikachu.equals(raichu);

        assertEquals(expected,actual);
    }


    /**
     * method testCompareTo()
     * used o check the working of our own compareTo method in the Pokemon class.
     */
    @Test
    public void testCompareTo(){
        Pokemon pikachu = new Pokemon("Pikachu",25);
        Pokemon raichu = new Pokemon("Raichu", 26);

        int expected = 1;
        int actual = pikachu.compareTo(raichu);

        assertEquals( expected, actual );

    }

}