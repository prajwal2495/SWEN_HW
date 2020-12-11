package Activities;

import java.util.Scanner;

/**
 * @author Prajwal Krishna
 * beginning of class StringTester
 * Aims to tests String by shallow and deep equality methods
 */

public class StringTester {

    /**
     * Method main()
     * Aims to identify the difference in String comparison
     * 1. when there is a comparison between String literals
     * 2. when there is comparison between dynamically allocated String
     * 3. difference between the usage of == and equals methos
     * @param args
     */
    public static void main(String[] args) {
        String a = "RIT";
        String b = "RIT";
        String c = "SWEN";

        System.out.println("Compare two strings:"+(a == b));


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string:");
        String first = scan.nextLine();
        System.out.print("Enter a string:");
        String second = scan.nextLine();

        System.out.println("Compare two string with ==:"+(first == second));
        System.out.println("Compare two string with equals:"+first.equals(second));
    }

}
