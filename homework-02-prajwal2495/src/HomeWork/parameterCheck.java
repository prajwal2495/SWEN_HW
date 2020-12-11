package HomeWork;
import java.util.Scanner;

/*
@author Prajwal Krishna
 */

public class parameterCheck
{
    /*
    This is a program that depicts how to concatenate different datatypes in a single string.
     */
    public static void main(String[] args)
    {
        /* this is the main method
        main() is calling concatenate() function
         */
        String name,result;
        int age;
        float height ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = scan.nextLine();

        System.out.println("Enter your age:");
        age = scan.nextInt();

        System.out.println("Enter your height in the format feet.inches");
        height = scan.nextFloat();

        // passing 3 parameters
        result = concatenate(name,age,height);

        System.out.println(result);
    }
    public static String concatenate(String first, int second, float third)
    {
        // returns a concatenated string using the passed parameters.
        return "My name is " + first + " and I am " + second + " years old" + " and my height is " + (third) + " feet";
    }
}
// end of parameterCheck