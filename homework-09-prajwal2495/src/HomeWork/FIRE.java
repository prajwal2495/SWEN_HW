package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of class FIRE, child class of Pokemon
 */
public class FIRE extends Pokemon {

    /**
     * Creates an object of FIRE type pokemon
     * @param name
     * @param type
     * @param attack
     * @param health
     */
    public FIRE(String name, PokemonTypes type, int attack, int health) {
        super(name, type, attack, health);
    }

    /**
     * Overriding the method Attacking from parent class
     * Used to check what type of pokemon FIRE is facing and adjust the attacking capability accordingly
     * @param attacked
     * @return Integer, current damage done by the FIRE pokemon
     */
    @Override
    public int Attacking(Pokemon attacked) {
        int current_damage;
       // this.setAttack(this.getAttack() * 2);
        if (attacked.getType().equals(PokemonTypes.FIRE) || attacked.getType().equals(PokemonTypes.NORMAL)) {

            return attacked.gotAttacked(this);

        } else if (attacked.getType().equals(PokemonTypes.GRASS)) {

            this.setAttack(this.getAttack() * 2);
            current_damage = attacked.gotAttacked(this);

            this.setAttack(this.getAttack() / 2);
            return current_damage;
        } else {

            this.setAttack(this.getAttack() / 2);
            current_damage = attacked.gotAttacked(this);

            this.setAttack(this.getAttack() * 2);
            return current_damage;
        }
    }
}
