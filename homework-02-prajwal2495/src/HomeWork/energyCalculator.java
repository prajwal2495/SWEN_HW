package HomeWork;

import java.util.Scanner;
/*
@author Prajwal Krishna
 */

public class energyCalculator
{
    /* this class is performing calculation that yields the energy output of an element,
    by using the famous formula E=Mc^2
     */

    // variable c holding the approximate value for speed of light in vacuum ( meters/second)
    private static long c = 299792458;

    public static void main(String[] args)
    {
        /* Main method calls the calculate() function to calculate the energy output
        and prints the result
         */

        double massOfElementInGrams;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mass of the element in grams:");
        massOfElementInGrams = scan.nextDouble();

        double result = calculate(massOfElementInGrams);
        System.out.println("Total energy output is: " + result + " Joules");
    }

    public static double calculate(double massInGrams)
    {
        // calculating the energy in joules
        double energy;
        energy = massInGrams * Math.pow(c,2);
        return energy;
    }


}
//end of energyCalculator