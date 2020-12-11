package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of class Arens
 */
public class Arena {

    private static int damage = 0;
    private static int remaining_health = 0;

    /**
     * A static method fight()
     * Fight method takes 2 params of type Pokemon.
     * This method helps in placing two pokemon in an arena and make them fight it out until one of them goes unconscious.
     * The fight is in a loop which breaks when one of the pokemon goes unconscious.
     * @param first of type Pokemon
     * @param second of type Pokemon
     */
    public static void Fight(Pokemon first, Pokemon second){
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println();

        boolean isKnockedOut = false;
        Pokemon winning_pokemon = null;

        while(isKnockedOut == false){
            if(second.getHealth() == 0 || second.isUnconscious() == true){
                isKnockedOut = true;
                winning_pokemon = first;
                System.out.println("Damage by " + first.getName() + " " + damage + " " + second.getName() + "'s remaining health is: " + remaining_health);
                System.out.println();
                System.out.println(second.getName()+" has ben defeated by "+winning_pokemon.getName()+"!!!!");
            }else if(first.getHealth() == 0 || first.isUnconscious() == true){
                isKnockedOut = true;
                winning_pokemon = second;
                System.out.println("Damage by " + second.getName() + " " + damage + " " + first.getName() + "'s remaining health is: " + remaining_health);
                System.out.println();
                System.out.println(first.getName()+" has been defeated by "+winning_pokemon.getName()+"!!!!!");
            }else{
                if((second.getHealth()) != 0 ){
                    damage = first.Attacking(second);
                    remaining_health = second.getHealth();
                    if(remaining_health == 0)
                        continue;
                    System.out.println("Damage by " + first.getName() + " " + damage + " " + second.getName() + "'s remaining health is: " + remaining_health);
                }
                if((first.getHealth()) != 0){
                    damage = second.Attacking(first);
                    remaining_health = first.getHealth();
                    if(remaining_health == 0)
                        continue;
                    System.out.println("Damage by " + second.getName() + " " + damage + " " + first.getName() + "'s remaining health is: " + remaining_health);
                }
            }
        }
    }
}


