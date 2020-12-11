package HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Prajwal Krishna
 * Beginning of class PokemonTester
 */
public class PokemonTester  {

    /**
     * Helps in generating --
     * 2 random values for attack
     * 2 random values for health
     * 2 random types of pokemon
     * 2 random pokemon objects
     * call Fight method of Arena and displays who won the bout
     * @param args
     */
    public static void main(String[] args) {
        int minHealth = 500;
        int maxHealth = 1000;
        int minAttack = 50;
        int maxAttack = 100;
        int attack1,attack2,health1,health2;
        String randomPokemon1,randomPokemon2;
        PokemonTypes randomType1 = null,randomType2 = null;
        boolean isFighting = true;
        Pokemon fighter1 = null,fighter2 = null;
        String[] firePokemon = new String[]{"Charizad", "Arcanine", "NineTails", "Rapidash", "Magmar"};
        String[] grassPokemon = new String[]{"Cheekorita", "Bulbasaur", "Sceptile", "Vileplume", "Exeggutor"};
        String[] normalPokemon = new String[]{"Snorlax", "Eevee", "Ditto", "Rattata", "Zigzagoon"};
        String[] waterPokemon = new String[]{"Blastoise", "Kingler", "Seadra", "Tentacruel", "Cloyster"};

        Scanner scan = new Scanner(System.in);


        while (isFighting) {
            System.out.println();
            System.out.println("Do you wanna see a fight between pokemons ? (Y / quit):");
            String choice = scan.nextLine();

            if (choice.equals("quit")) {
                break;
            }else{
                attack1 = generateRandomAttack(minAttack, maxAttack);
                health1 = generateRandomHealth(minHealth, maxHealth);
                randomType1 = generateRandomPokemonType();
                //randomType1 = PokemonTypes.FIRE;
                if (randomType1.equals(PokemonTypes.FIRE)) {
                    randomPokemon1 = generateRandomPokemon(firePokemon);
                } else if (randomType1.equals(PokemonTypes.WATER)) {
                    randomPokemon1 = generateRandomPokemon(waterPokemon);

                } else if (randomType1.equals(PokemonTypes.GRASS)) {
                    randomPokemon1 = generateRandomPokemon(grassPokemon);

                } else {
                    randomPokemon1 = generateRandomPokemon(normalPokemon);
                }


                attack2 = generateRandomAttack(minAttack, maxAttack);
                health2 = generateRandomHealth(minHealth, maxHealth);
                randomType2 = generateRandomPokemonType();
                //randomType2 = PokemonTypes.WATER;
                if (randomType2.equals(PokemonTypes.FIRE)) {
                    randomPokemon2 = generateRandomPokemon(firePokemon);
                } else if (randomType2.equals(PokemonTypes.WATER)) {
                    randomPokemon2 = generateRandomPokemon(waterPokemon);
                } else if (randomType2.equals(PokemonTypes.GRASS)) {
                    randomPokemon2 = generateRandomPokemon(grassPokemon);
                } else {
                    randomPokemon2 = generateRandomPokemon(normalPokemon);
                }

                if(randomType1.equals(PokemonTypes.FIRE)){
                      fighter1 = new FIRE(randomPokemon1,randomType1,attack1,health1);
                }else if(randomType1.equals(PokemonTypes.WATER)){
                      fighter1 = new WATER(randomPokemon1,randomType1,attack1,health1);
                }else if(randomType1.equals(PokemonTypes.GRASS)){
                      fighter1 = new GRASS(randomPokemon1,randomType1,attack1,health1);
                }else {
                      fighter1 = new Pokemon(randomPokemon1,randomType1,attack1,health1);
                }


                if(randomType2.equals(PokemonTypes.FIRE)){
                     fighter2 = new FIRE(randomPokemon2,randomType2,attack2,health2);
                }else if(randomType2.equals(PokemonTypes.WATER)){
                     fighter2 = new WATER(randomPokemon2,randomType2,attack2,health2);
                }else if(randomType2.equals(PokemonTypes.GRASS)){
                     fighter2 = new GRASS(randomPokemon2,randomType2,attack2,health2);
                }else {
                     fighter2 = new Pokemon(randomPokemon2,randomType2,attack2,health2);
                }


                Arena.Fight(fighter1,fighter2);

            }
        }
    }

    /**
     * Uses enum PokemonTypes to generate random types of pokemon.
     * @return a Member of Enum, Random value.
     */
    public static PokemonTypes generateRandomPokemonType () {
        Random random = new Random();
        PokemonTypes[] types = PokemonTypes.values();
        int length = types.length;
        int randomIndex = random.nextInt(length);
        return types[randomIndex];
    }

    /**
     * @param pokemon, A string array containing names of the pokemon
     * @return String, A random pokemon
     */
    public static String generateRandomPokemon (String[]pokemon){
        Random random = new Random();
        int length = pokemon.length;
        int randomIndex = random.nextInt(length);
        return pokemon[randomIndex];
    }

    /**
     *
     * @param min, minimum attacking capability of each pokemon
     * @param max, maximum attacking capability of each pokemon
     * @return integer, A random value between min and max
     */
    public static int generateRandomAttack ( int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    /**
     *
     * @param min, minimum Health of each pokemon
     * @param max, maximum Health of each pokemon
     * @return integer, A random value between min and max
     */
    public static int generateRandomHealth ( int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

}