package HomeWork;

/**
 * @author Prajwal Krishna
 * Beginning of class Pokemon
 */
public class Pokemon {
    private String name;
    private PokemonTypes type;
    private int attack;
    private int health;
    private boolean isConscious;

    /**
     * A self defined parameterless constructor of the class
     * assigns default value to all the private fields
     */
    public Pokemon(){
        this.name = "Pikachu";
        this.type = PokemonTypes.NORMAL;
        this.attack = 25;
        this.health = 500;
    }

    /**
     * A parameterised constructor of the class
     * it initialises all the private members of the class when an object of pokemon is created
     * @param name
     * @param type
     * @param attack
     * @param health
     */
    public Pokemon(String name, PokemonTypes type, int attack, int health){
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.health = health;
    }

    /**
     * Method gotAttacked()
     * Takes an object of Pokemon as parameter
     * calculates the attack done by the attacker on the other pokemon
     * calculates the damage taken by the pokemon which was attacked and return exactly how much damage was donw
     * @param Attacker
     * @return an integer, exactly how much damage was done
     */
    public int gotAttacked(Pokemon Attacker){
        int currentHealth = this.health - Attacker.attack;
        int currentDamage = Attacker.attack;

        if(currentHealth < 0){
            currentDamage = Attacker.attack + currentHealth;
            currentHealth = 0;
            this.health = currentHealth;
            this.isConscious = false;
        }else if(currentHealth == 0){
            currentDamage = Attacker.attack;
            this.health = 0;
            this.isConscious = false;
        }else{
            currentDamage = Attacker.attack;
            this.health = currentHealth;
        }
        return currentDamage;
    }

    /**
     * Method Attacking()
     * takes an object of pokemon as parameter
     * Calls the gotAttacked method but the call to the function would be made by another pokemon
     * @param Attacked
     * @return an integer, exactly how much damage was done
     */
    public int Attacking(Pokemon Attacked){
        return Attacked.gotAttacked(this);
    }

    /**
     * Checks whether a pokemon is conscious or not
     * @return a boolean value stating whether pokemon is conscious or not
     */
    public boolean isUnconscious(){
        if(this.isConscious){
            return true;
        }
        return false;
    }

    /**
     * @return String, Name of the pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * @return a Member of enum PokemonTypes, the type of pokemon
     */
    public PokemonTypes getType() {
        return type;
    }

    /**
     * @return integer, capacity of attack of respective pokemon
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the attacking capacity of a pokemon temporarily based on the pokemon it is attacking
     * could be set to lower/higher it's original value
     * @param attack
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * @return integer, the current health of the respective pokemon
     */
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return String, a detailed information of the pokemon
     */
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }
}
