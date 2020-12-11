package HomeWork;

import java.util.Scanner;
/*
**
@author Prajwal Krishna
**
 */

// class IsPrimeOrNot begins

public class IsPrimeOrNot {

    /*
    Main method :
    prompts the user to enter N to determine whether it is prime or not and gives an choice to use FOR or WHILE or Do-While loops

    Prompts the user to enter N and prints N primes
     */
    public static void main(String[] args) {
        int number,upperLimit;
        char choice;
        boolean result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to determine whether it is prime or not:");
        number = scan.nextInt();
        System.out.println("choose your favorite loop\nEnter f for for loop\nEnter w for while loop\nEnter d for do while loop");
        choice = scan.next().charAt(0);


        if(choice == 'f') {
            long startTimeForLoop = System.currentTimeMillis();
            result = isPrimeForLoop(number);
            System.out.println(result);
            long endTimeForLoop = System.currentTimeMillis();
            long timeElapsed = endTimeForLoop - startTimeForLoop;
            System.out.println("Time Elapsed : For Loop in ms: " + timeElapsed);
        }


        if(choice == 'w') {
            long startTimeWhileLoop = System.currentTimeMillis();
            result = isPrimeWhileLoop(number);
            System.out.println(result);
            long endTimeWhileLoop = System.currentTimeMillis();
            long timeElapsed = endTimeWhileLoop - startTimeWhileLoop;
            System.out.println("Time elapsed: While Loop in ms: " + timeElapsed);
        }


        if(choice == 'd') {
            long startTimeDoWhileLoop = System.currentTimeMillis();
            result = isPrimeDoWhileLoop(number);
            System.out.println(result);
            long endTimeDoWhileLoop = System.currentTimeMillis();
            long timeElapsed = endTimeDoWhileLoop - startTimeDoWhileLoop;
            System.out.println("Time elapsed: Do While loop: " + timeElapsed);
        }


        System.out.println("Enter a number and we will print all the N primes :");
        upperLimit = scan.nextInt();
        long startTimeRange = System.currentTimeMillis();
        isPrimeRange(upperLimit);
        long endTimeRange = System.currentTimeMillis();
        long timeElapsed = endTimeRange - startTimeRange;
        System.out.println("\nTime elapsed: Range of Primes in ms: "+timeElapsed);

    }

    //printing N primes
    private static void isPrimeRange(int upperLimit) {
        int prime = 2,count,flag;
        int i = 1;
        while(i <= upperLimit)
        {
            flag = 1;
            for(count = 2; count <= prime - 1; count++)
            {
                if(prime % count == 0)  //Will be true if p is not prime
                {
                    flag = 0;
                    break;      //Loop will terminate if p is not prime
                }
            }
            if(flag == 1)
            {
                System.out.print(prime + " ");
                i++;
            }
            prime++;
        }

    }

    // prime or not using for loop
    public static boolean isPrimeForLoop(int n){

        for(int i = 2; i <= n / 2; i ++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    // prime or not using while loop
    public static boolean isPrimeWhileLoop(int n){
        int i = 2;
        while(i <= n / 2){
            if(n % i == 0)
                return false;
            ++i;
        }
        return true;
    }

    // prime or not using do while loop
    public static boolean isPrimeDoWhileLoop(int n){
        int i = 2;
        do
        {
            if((n != 2) && (n % i == 0))
            {
                return false;
            }
            i++;
        }while(i <= Math.sqrt(n));

        return true;
    }
}

// end of class IsPrimeOrNot


