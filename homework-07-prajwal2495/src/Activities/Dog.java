package Activities;
import HomeWork.*;
//Class dog begins
public class Dog {

    //private fields of the class
    private String name,breed;
    private int age;
    private double weight;

    // parametrised constructor
    public Dog(String name ,String breed, int age, double weight){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    //constructor chaining
    public Dog(String name){

        this(name, "huskey",9,8.9);
    }

    /*
    parameterless constructor
    sets all the private fields to appropriate default values
     */
    public Dog(){
        this.name = "max";
        this.breed = "dash hound";
        this.age = 2;
        this.weight = 7.2;

    }

    //behavior method birthday()
    //add 1 to to field age
    public void birthday(){
        this.age = this.age + 1;
        System.out.println("Happy birthday " +this.name+" you are "+ this.age+" years old");
    }

    /*
    behavior method eat()
    keeps track of calorie intake of the dog and weight gained.
     */
    public void eat(double calories){
        this.weight += (calories / 3000.0);
    }

    /*
    behavior method walk()
    keeps track of the physical exercise of the dog and the calories burnt
     */
    public void walk(double miles){
        double burned = miles + 100.0;
        weight -= (burned / 3000.0);
    }

    @Override
    public String toString(){
        return "[Name:"+this.name+" Breed:"+this.breed+" Age:"+this.age+" Weight:"+this.weight+"]";
    }

    /*
    Main method()
    initialises the objects of the class Dog and calls the appropriate constructors/methods/getters/setters as per requirement
     */
    public static void main(String[] args) {
        Dog goku = new Dog("goku","german shepherd", 10, 10.04);
        System.out.println("Name:"+goku.name);
        System.out.println("Breed:"+goku.breed);
        System.out.println("Age:"+goku.age);
        System.out.println("Weight:"+goku.weight);

        System.out.println();

        Dog max = new Dog();
        System.out.println("Name:"+max.name);
        System.out.println("Breed:"+max.breed);
        System.out.println("Age:"+max.age);
        System.out.println("Weight:"+max.weight);

        System.out.println();

        Dog goofy = new Dog("goofy");
        System.out.println("Name:"+goofy.name);
        System.out.println("Breed:"+goofy.breed);
        System.out.println("Age:"+goofy.age);
        System.out.println("Weight:"+goofy.weight);

        System.out.println();

        goku.eat(4000);
        goofy.eat(2000);
        max.eat(1000);

        System.out.println("Goku weight after meal:"+goku.weight);
        System.out.println("Goofy weight after meal:"+goofy.weight);
        System.out.println("Max weight after meal:"+max.weight);


        System.out.println();

        goku.walk(10);
        goofy.walk(10);
        max.walk(20);

        System.out.println("Goku weight after a walk:"+goku.weight);
        System.out.println("Goofy weight after a walk:"+goofy.weight);
        System.out.println("Max weight after a walk:"+max.weight);

        System.out.println();

        goku.birthday();
        goofy.birthday();
        max.birthday();

        System.out.println();

        System.out.println(goku.toString());
        System.out.println(goofy.toString());
        System.out.println(max.toString());
    }
}
