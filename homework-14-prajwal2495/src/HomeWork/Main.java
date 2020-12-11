package HomeWork;

import java.util.Comparator;

/**
 * @author Prajwal Krishna
 * begining of class main
 * helps to create a tree to maintan a pokedex
 * creates a tree based on the pokemon number and stores all the values of the respective pokemons in the right/left node
 */
public class Main {
    public static void main(String[] args) {


        Pokemon Pikachu = new Pokemon("Pikachu",25);
        Pokemon Raichu = new Pokemon("Raichu",26);
        Pokemon Dragonair = new Pokemon("Dragonair",147);
        Pokemon Magikarp = new Pokemon("Magikarp",129);
        Pokemon Mew = new Pokemon("Mew",151);
        Pokemon Snowlarx = new Pokemon("Snowlarx",143);
        Pokemon Mewtwo = new Pokemon("Mewtwo",10);
        Pokemon Dragonite = new Pokemon("Dragonite",149);
        Pokemon Gasly = new Pokemon("Gasly",92);

        Comparator pokemonComparator = new PokemonComparator<>();
        BinaryNode<Pokemon> node = new BinaryNode<>(Pikachu);
        node.binaryInsert(Raichu);
        node.binaryInsert(Dragonair);
        node.binaryInsert(Magikarp);
        node.binaryInsert(Mew);
        node.binaryInsert(Snowlarx);
        node.binaryInsert(Mewtwo);
        node.binaryInsert(Dragonite);

        System.out.println("Pokemon "+Gasly.getPokemonName()+" present in the pokedex: "+node.binarySearch(Gasly));
        System.out.println("Pokemon "+Dragonite.getPokemonName()+" present in the pokedex: "+node.binarySearch(Dragonite));


        Visitor visitor = new StringifyVisitor();
        node.infixTraversal(visitor);
        System.out.println(visitor);
    }
}
