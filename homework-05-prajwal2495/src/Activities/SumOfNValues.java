package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class SumOfNValues begins
public class SumOfNValues {

    /*
    main method
    prompts user to enter a number N
    calls function FindSum to determine sum of N numbers
     */
    public static void main(String[] args) {
        int n,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number N to obtain sum of N numbers: ");
        System.out.println("Handles negative numbers also");
        n = scan.nextInt();
        result = FindSum(n);
        System.out.println("Sum of N numbers is: "+result);
    }

    /*
    method FindSum
    checks whether the number is -ve or +ve
    based on the type of the number FindSum is called recursively to return sum of N numbers
     */
    public static int FindSum(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        else if (n > 0) {
            n = n + FindSum(n - 1);
        }else {
            n = n + FindSum(n + 1);
        }

        return n;
    }
}
// end of SumOfNValues class