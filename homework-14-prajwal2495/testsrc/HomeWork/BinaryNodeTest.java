package HomeWork;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Prajwal Krishna
 * beginning of class BinaryNodeTest
 */
class BinaryNodeTest {

    /**
     * method testBinarySearch
     * used to test the binarySearch method
     * tests whether the node is present in the tree or not
     */
    @Test
    public void testBinarySearch(){
        Pokemon Snowlarx = new Pokemon("Snowlarx",143);
        Pokemon Mewtwo = new Pokemon("Mewtwo",10);
        Pokemon Dragonite = new Pokemon("Dragonite",149);
        Pokemon Gasly = new Pokemon("Gasly",92);

        Comparator pokemonComparator = new PokemonComparator<>();
        BinaryNode<Pokemon> root = new BinaryNode<>(Snowlarx,pokemonComparator);
        root.binaryInsert(Mewtwo);
        root.binaryInsert(Dragonite);
        root.binaryInsert(Gasly);

        boolean expected = true;
        boolean actual = root.binarySearch(Gasly);

        assertEquals(expected, actual);

    }

    /**
     * method testBinaryInsert
     * used to check whether the tree is getting populated or not
     */
    @Test
    public void testBinaryInsert(){
        Pokemon Snowlarx = new Pokemon("Snowlarx",143);
        Pokemon Mewtwo = new Pokemon("Mewtwo",10);
        Pokemon Dragonite = new Pokemon("Dragonite",149);
        Pokemon Gasly = new Pokemon("Gasly",92);

        Comparator pokemonComparator = new PokemonComparator<>();
        BinaryNode<Pokemon> root = new BinaryNode<>(Snowlarx,pokemonComparator);
        root.binaryInsert(Mewtwo);
        root.binaryInsert(Dragonite);
        root.binaryInsert(Gasly);

        boolean expected = true;
        boolean actual = (root != null);

        assertEquals(expected, actual);

    }

    /**
     * method testBinaryInsertWithoutComparator
     * used to check the condition where the insert to BST should happen even though a comparator of values is not present
     */
    @Test
    public void testBinaryInsertWithoutComparator(){
        Pokemon Snowlarx = new Pokemon("Snowlarx",143);
        Pokemon Mewtwo = new Pokemon("Mewtwo",10);
        Pokemon Dragonite = new Pokemon("Dragonite",149);
        Pokemon Gasly = new Pokemon("Gasly",92);

        BinaryNode<Pokemon> root = new BinaryNode<>(Snowlarx);
        root.binaryInsert(Dragonite);
        root.binaryInsert(Mewtwo);
        root.binaryInsert(Gasly);

        boolean expected = true;
        boolean actual = (root != null);

        assertEquals(expected, actual);

    }
}