package HomeWork;


import java.util.Scanner;

//class PhysicalElements begins
public class PhysicalElements {

    //Private fields
    private String name,symbol;
    private int atomicNumber;
    private double atomicWeight;

    //constructor to set the private elements to default values
    public PhysicalElements(){
        this.name = "Pass the name of the element";
        this.symbol = "Pass the symbol of the element";
        this.atomicNumber = 0;
        this.atomicWeight = 0.0;
    }

    // chaining constructors
    //passing only one parameter to set the name of the element
    public PhysicalElements(String name){
        this(name,"Pass the symbol of the element",0,0.0);
    }

    //chaining constructors
    //passing two parameter to set the name and symbol of the element
    public PhysicalElements(String name, String symbol){
        this(name,symbol,0,0.0);
    }

    //chaining constructors
    //passing 3 parameter to set the name, symbol and atomic number of the element
    public PhysicalElements(String name, String symbol,int atomicNumber){
        this(name, symbol, atomicNumber,0.0);
        //System.out.println("You have not passed atomic weight of the element:"+name+" setting to default values.");
    }

    //chaining constructors
    //passing 3 parameter to set the name, symbol and atomic weight of the element
    public PhysicalElements(String name, String symbol,double atomicWeight){
        this(name, symbol,0,atomicWeight);
        //System.out.println("You have not passed atomic number of the element:"+name+" setting to default values.");
    }

    public void getName(){
        System.out.println("Element: "+this.name);
    }
    public void getSymbol(){
        System.out.println("Chemical symbol is:"+this.symbol);
    }
    public void getAtomicNumber(){
        System.out.println("Atomic NUmber: "+this.atomicNumber);
    }
    public void getAtomicWeight(){
        System.out.println("Atomic weight: "+this.atomicWeight);
    }


    //constructor to set values to each field of the class as passed by the user
    public PhysicalElements(String name,String symbol, int atomicNumber, double atomicWeight){
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    @Override
    public String toString(){
        return "[Element:"+ name +", Symbol:"+ symbol +", Atomic Number:"+ atomicNumber +", Atomic Weight:"+atomicWeight+"]\n";
    }

    /*
    mutator to set the atomic weight of the element
    Atomic weight usually depends on 3 factors
    1. how many isotopes are present for the respective element
    2. percentage of abundance of isotopes
    3. mass of the isotopes
    multiplying percentage of abundance of isotopes and mass of the respective isotopes gives us the atomic weight of the element
     */
    public void setAtomicWeight(int isotopes){
        double[] abundance = new double[isotopes] ;
        double[] mass = new double[isotopes];
        System.out.println("Atomic Weight of an element depends on the mass of the isotopes and abundance in which they are available, hence using Mutators");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the abundance of "+ isotopes + " isotopes:");
        for(int i = 0; i < isotopes; i++){
            abundance[i] = scan.nextDouble();
        }
        System.out.println("Enter the mass of the "+ isotopes + " isotopes:");
        for(int i = 0 ; i < mass.length; i++){
            mass[i] = scan.nextDouble();
        }
        for(int i = 0; i < abundance.length; i++){
            this.atomicWeight += ((abundance[i] / 100) * mass[i]);
        }
    }

}
// end of class PhysicalElements