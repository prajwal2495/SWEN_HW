package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of class WATER, child class of Pokemon
 */
public class WATER extends Pokemon{

    /**
     * Creates an object of WATER type pokemon
     * @param name
     * @param type
     * @param attack
     * @param health
     */
    public WATER(String name, PokemonTypes type, int attack, int health) {
        super(name, type, attack, health);
    }

    /**
     * Overriding the method Attacking from parent class
     * Used to check what type of pokemon WATER is facing and adjust the attacking capability accordingly
     * @param attacked
     * @return Integer, current damage done by the WATER pokemon
     */
    @Override
    public int Attacking(Pokemon attacked) {
        int current_damage;

        if (attacked.getType().equals(PokemonTypes.WATER) || attacked.getType().equals(PokemonTypes.NORMAL)) {

            return attacked.gotAttacked(this);

        } else if (attacked.getType().equals(PokemonTypes.FIRE)) {
            this.setAttack(this.getAttack() * 2);
            current_damage = attacked.gotAttacked(this);

            this.setAttack(this.getAttack() / 2);
            return current_damage;

        }else{
            this.setAttack(this.getAttack() / 2);
            current_damage = attacked.gotAttacked(this);

            this.setAttack(this.getAttack() * 2);
            return current_damage;
        }
    }
}
