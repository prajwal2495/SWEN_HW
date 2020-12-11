package HomeWork;

import java.util.Scanner;

/*
@author Prajwal Krishna
 */

public class temperatureConvertor
{
    /* this class is performing calculation that gives us the kelvin temperature value for the given Fahrenheit
    by using the famous formula K = 5/9 * (f - 32) + 273
     */
    public static double convertToKelvin(double degreesFahrenheit)
    {
        // converting given fahrenheit to kelvin
       return  ((5.0/9.0) * (degreesFahrenheit - 32.0)) + 273.0 ;

    }

    public static void main (String args[])
    {
        /*
        This is the main method that takes fahrenheit as input and passes
        it to the method converToKelvin()
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double fah = scan.nextDouble();

        double result = convertToKelvin(fah);

        System.out.println(fah + " Fahrenheit is " + (result) + " degrees Kelvin");
    }
}
//end of temperatureConvertor