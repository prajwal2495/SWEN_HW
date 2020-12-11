package HomeWork;

/**
 * @author Prajwal Krishna
 * beginning pf class Pokemon , extends PokemonComparator and implements Comparable
 * @param <T>, Pokemon class is a generic type class
 */
public class Pokemon<T> extends PokemonComparator implements Comparable<T> {

    private String pokemonName;
    private int pokemonNumber;

    /**
     * Constructor Pokemon
     * initialises pokemon name and number
     * @param pokemonName, name of the pokemon
     * @param pokemonNumber, number associated with that pokemon
     */
    public Pokemon(String pokemonName, int pokemonNumber){
        this.pokemonName = pokemonName;
        this.pokemonNumber = pokemonNumber;
    }

    /**
     * method getPokemonName
     * used to get the name of the pokemon
     * @return a String, name of the pokemon
     */
    public String getPokemonName() {
        return pokemonName;
    }

    /**
     * method getPokemonNumber()
     * used to get the number associated with the respective pokemon
     * @return an integer, number of the pokemon
     */
    public int getPokemonNumber() {
        return pokemonNumber;
    }

    /**
     * method toString()
     * @return a String, a specific type of representing pokemon name and its number
     */
    @Override
    public String toString() {
        return pokemonName + "("+pokemonNumber+")";
    }

    /**
     * method equals
     * used to check whether two pokemons are same, based on the number associated with the 2 pokemons
     * @param o, an Object
     * @return a boolean value based on the result of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pokemon pokemon = (Pokemon) o;

        if (pokemonNumber != pokemon.pokemonNumber) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public int hashCode() {
        int result = pokemonName != null ? pokemonName.hashCode() : 0;
        result = 31 * result + pokemonNumber;
        return result;
    }

    /**
     * method compareTo()
     * used to compare an object with another object
     * @param o, an object of generic type T
     * @return and integer based on the comparison logic execution
     */
    @Override
    public int compareTo(T o) {
        Pokemon pokemon1 = (Pokemon) o;
        Pokemon pokemon2 = (Pokemon) this;

        if(pokemon1.getPokemonNumber() < pokemon2.getPokemonNumber()){
            return -1;
        }else if(pokemon1.getPokemonNumber() > pokemon2.getPokemonNumber()) {
            return 1;
        }else {
            return 0;
        }
    }
}
