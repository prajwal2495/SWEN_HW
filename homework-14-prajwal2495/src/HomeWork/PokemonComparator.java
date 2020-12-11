package HomeWork;

import java.util.Comparator;

/**
 * @author Prajwal krishna
 * beginning of class PokemonComparator implements Java's Comparator interface
 * @param <T>, PokemonComparator is a generic type class
 */
public class PokemonComparator<T> implements Comparator<T> {

    /**
     * method compare()
     * used to compare the pokemon numbers of the specific pokemons and return the specific values
     * @param o1, a generic type object
     * @param o2, a generic type object
     * @return an integer based on the comparison on the pokemon numbers
     */
    @Override
    public int compare(T o1, T o2) {
        Pokemon pokemon1 = (Pokemon) o1;
        Pokemon pokemon2 = (Pokemon) o2;
        if(pokemon1.getPokemonNumber() < pokemon2.getPokemonNumber()){
            return 1;
        }else if(pokemon1.getPokemonNumber() > pokemon2.getPokemonNumber()) {
            return -1;
        }else {
            return 0;
        }
    }
}
