package Activities;

/**
@author Prajwal Krishna

Beginning of class car
Gives the model,color,vinNumber and year
Uses a Enum to update the make of the car
 */
public class Car {
    private String model,color,vinNumber;
    private carMake make;
    private int year;
    private static int CARCOUNT = 0;

    /**
     * Constructor Car
     * Initializes make using Enum, Model, year, color and vinNumber of a particular car
     * @param make
     * @param model
     * @param year
     * @param color
     * @param vinNumber
     */
    public Car(carMake make,String model,int year,String color,String vinNumber ){
        CARCOUNT++;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vinNumber = vinNumber;
    }

    /**
    Method getCount()
    Prints the number cars
     */
    public static void getCarCount(){
        System.out.println("number of cars: "+Car.CARCOUNT);
    }

    /**
    Method getMake()
     @return an Enum object of carMake

     */
    public carMake getMake(){
        return this.make;
    }

    /**
     * Method getModel()
     * @return String, which is the model of the particular car
     */
    public String getModel(){
        return this.model;
    }

    /**
     * Method getColor()
     * @return String, which is the color of the particular car
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Method getVinNumber()
     * @return String, which is the vinNumber of the car
     */
    public String getVinNumber(){
        return this.vinNumber;
    }

    /**
     * Method getYear()
     * @return integer, which is the year of manufacture of the car
     */
    public int getYear(){
        return this.year;
    }

    @Override
    /**
     * overriding the method toString()
     * @return String, returns a string with all the information of the particular car
     */
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", vinNumber='" + vinNumber + '\'' +
                ", year=" + year +
                '}';
    }

    /**
     * Main() method
     * @param args
     * Creating objects of class Car
     * uses toString to print all the information of the particular car
     * shallow and deep equality of objects are being performed
     */
    public static void main(String[] args) {
        Car swift = new Car(carMake.CHEVY,"Swift", 2012,"White","KA123123");
        Car XUV = new Car(carMake.FERRARI,"XUV",2018,"Red","MH234238409");
        Object var = swift;
        System.out.println(swift.toString());
        System.out.println(XUV.toString());
        System.out.println("Compare two objects using ==:"+(swift == XUV));
        System.out.println("Comparing copy of an object using ==:"+(var == swift));

        Car swift2 = new Car(carMake.CHEVY,"Swift", 2012,"White","KA123123");

        System.out.println("Compare make using equals method:"+swift.getMake().equals(swift2.getMake()));
        System.out.println("Compare vins using equals method:"+swift.getVinNumber().equals(swift2.getVinNumber()));
        System.out.println("Compare 2 objects using equals method:"+swift.equals(swift2));

        //Number of cars
        Car.getCarCount();

    }
}
