package Activities;

/*
**
@author Prajwal Krishna
**
 */

import java.util.Scanner;

// class FibonacciSeries begins
public class FibonacciSeries {

    /*
    method series
    return fibonacci series of number given recursively
     */
    static int n1 = 0, n2 = 1, n3 = 0;
    public static void series(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            series(n - 1);

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to find out it's fibonacci series");
        int n = scan.nextInt();
        System.out.print(n1 + " " + n2); // handling 0 and 1
        series(n - 2); // already 2 numbers are printed hence n - 2

    }
}
// end of class FibonacciSeries