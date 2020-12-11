package HomeWork;
import HomeWork.PhysicalElements;

import java.util.Scanner;

//class TestAllClasses begins
public class TestAllClasses {

    /*
    Method PhysicalElements
    creates an object of class PhysicalElements
    sets the name,symbol and atomic number of the element
    computes the atomic weight of the element using the mutators in PhysicalElements class
     */
    public static void PhysicalElements(){
        PhysicalElements hydrogen = new PhysicalElements("Hydrogen","H",1,0.0);
        String data = hydrogen.toString();
        System.out.println(data);
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        int isotopes = scan.nextInt();
        hydrogen.setAtomicWeight(isotopes);
        data = hydrogen.toString();
        System.out.println(data);

        PhysicalElements helium = new PhysicalElements("Helium","He",2,0.0);
        data = helium.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        helium.setAtomicWeight(isotopes);
        data = helium.toString();
        System.out.println(data);


        PhysicalElements nitrogen = new PhysicalElements("Nitrogen","N",7,0.0);
        data = nitrogen.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        nitrogen.setAtomicWeight(isotopes);
        data = nitrogen.toString();
        System.out.println(data);

        PhysicalElements oxygen = new PhysicalElements("oxygen","O",8,0.0);
        data = oxygen.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        oxygen.setAtomicWeight(isotopes);
        data = oxygen.toString();
        System.out.println(data);

        PhysicalElements iron = new PhysicalElements("iron","Fe",26,0.0);
        data = iron.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        iron.setAtomicWeight(isotopes);
        data = iron.toString();
        System.out.println(data);

        PhysicalElements magnesium = new PhysicalElements("magnesium","Mg",12,0.0);
        data = magnesium.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        magnesium.setAtomicWeight(isotopes);
        data = magnesium.toString();
        System.out.println(data);

        PhysicalElements boron = new PhysicalElements("boron","B",5,0.0);
        data = boron.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        boron.setAtomicWeight(isotopes);
        data = boron.toString();
        System.out.println(data);

        PhysicalElements carbon = new PhysicalElements("carbon","C",6,0.0);
        data = carbon.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        carbon.setAtomicWeight(isotopes);
        data = carbon.toString();
        System.out.println(data);

        PhysicalElements sodium = new PhysicalElements("sodium","Na",11,0.0);
        data = sodium.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        sodium.setAtomicWeight(isotopes);
        data = sodium.toString();
        System.out.println(data);

        PhysicalElements copper = new PhysicalElements("copper","Cu",29,0.0);
        data = copper.toString();
        System.out.println(data);
        scan = new Scanner(System.in);
        System.out.println("To calculate Atomic weight, please enter the number of isotopes:");
        isotopes = scan.nextInt();
        copper.setAtomicWeight(isotopes);
        data = copper.toString();
        System.out.println(data);

    }

    /*
    Method Thermometer
    creates an object of class Thermometer
    takes an input temperature and the scale of the temperature
    outputs the corresponding other 2 scales for the same temperature
    i.e., 100 c
    Celsius: 100.0
    Fahrenheit is: 212.0
    Kelvin is: 373.15
     */
    public static void Thermometer(){
        boolean flag = true;
        Thermometer celsius1 = new Thermometer();
        Scanner scan = new Scanner(System.in);
        while(flag) {
            System.out.println("Enter the temperature:");
            double temp = scan.nextDouble();
            System.out.println("Enter the scale of the temperature: c for celsius, f for fahrenheit and k for kelvin");
            String scale = scan.next();

            if (scale.equals("c")) {
                celsius1.setCelsius(temp, scale);
                celsius1.getCelsius();
                celsius1.setFahrenheit(temp, scale);
                celsius1.getFahrenheit();
                celsius1.setKelvin(temp, scale);
                celsius1.getKelvin();
            }
            if (scale.equals("f")) {
                celsius1.setFahrenheit(temp, scale);
                celsius1.getFahrenheit();
                celsius1.setCelsius(temp, scale);
                celsius1.getCelsius();
                celsius1.setKelvin(temp, scale);
                celsius1.getKelvin();
            }
            if (scale.equals("k")) {
                celsius1.setKelvin(temp, scale);
                celsius1.getKelvin();
                celsius1.setFahrenheit(temp, scale);
                celsius1.getFahrenheit();
                celsius1.setCelsius(temp, scale);
                celsius1.getCelsius();
            }

            String allTemps = celsius1.toString();
            System.out.println(allTemps);
            System.out.println("do you want to continue testing the class ? type 'true' to continue testing, 'false' to end the program");
            flag = scan.nextBoolean();
        }
        System.out.println("BYE!");

    }

    /*
    method Ratings
    creates an object of class ProfessorRatings
    helps in getting name and subject the professor is teaching in a given university
    provides method to give ratings and compute overall rating
     */
    public static void Ratings(){

        Scanner scan = new Scanner(System.in);
        String sub,uni_name,name,last_name;
        double quality,difficulty;
        ProfessorRatings xyz = new ProfessorRatings();
        ProfessorRatings Dumbledore = new ProfessorRatings("Albus","Dumbledore","Hogwarts","Wizardry");
        ProfessorRatings Snape = new ProfessorRatings("Severus","Snape","Hogwarts","Dark Arts");
        System.out.println(Dumbledore.toString());
        System.out.println(Snape.toString());


        System.out.println("Enter the name of the professor:");
        name = scan.nextLine();
        System.out.println("Enter the last name of the professor:");
        last_name = scan.nextLine();
        System.out.println("Enter the name of the new subject Professor Dumbledore is teaching");
        sub = scan.nextLine();
        System.out.println("Enter the university name:");
        uni_name = scan.nextLine();
        System.out.println("Enter a rating for quality of teaching, 0 being awful and 5 being awesome");
        quality = scan.nextDouble();
        System.out.println("Enter the level of difficulty:");
        difficulty = scan.nextDouble();

        Dumbledore.setName(name);
        Dumbledore.setLast_name(last_name);
        Dumbledore.setSubject(sub);
        Dumbledore.setUni_name(uni_name);
        Dumbledore.addRatings(quality,difficulty);
        Dumbledore.setOverall_average_rating();
        System.out.println();
        System.out.println(Dumbledore.toString());


        System.out.println("Enter the name of the professor:");
        name = scan.next();
        System.out.println("Enter the last name of the professor:");
        last_name = scan.next();
        System.out.println("Enter the name of the new subject Professor Snape is teaching:");
        sub = scan.next();
        System.out.println("Enter the university name:");
        uni_name = scan.next();
        System.out.println("Enter a rating for quality of teaching, 0 being awful and 5 being awesome");
        quality = scan.nextDouble();
        System.out.println("Enter the level of difficulty:");
        difficulty = scan.nextDouble();

        Snape.setName(name);
        Snape.setLast_name(last_name);
        Snape.setSubject(sub);
        Snape.setUni_name(uni_name);
        Snape.addRatings(quality,difficulty);
        Snape.setOverall_average_rating();
        System.out.println();
        System.out.println(Snape.toString());

    }
    /*
    Main method
    choose between 3 classes to test
     */
    public static void main(String[] args) {
        System.out.println("pick your choice to test:");
        System.out.println("1. Test PhysicalElements class");
        System.out.println("2. Test Thermometer class");
        System.out.println("3. Test Ratings class");
        System.out.println("Enter your choice:");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice){
            case 1:PhysicalElements();
                break;

            case 2:Thermometer();
                break;

            case 3:Ratings();
                break;

            default:
                System.out.println("wrong choice");
                break;
        }
    }

}
// end of class TestAllClasses