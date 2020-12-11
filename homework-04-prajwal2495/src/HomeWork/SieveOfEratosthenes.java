package HomeWork;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class SieveOfEratosthenes begins
public class SieveOfEratosthenes {

    /*
    Main method:
    prompts the user to input the range
    print all the primes from 0 - range
     */
    public static void main(String[] args) {
        int size;
        int range;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number N and we will print all the primes from 0 - N: ");
        range = scan.nextInt();
        long startTime = System.currentTimeMillis();
        primeRangeUsingSieveOfEratosthenes(range);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("\nTime elapsed in ms: "+timeElapsed );
    }



    // method primeRangeUsingSieveOfEratosthenes
    public static void primeRangeUsingSieveOfEratosthenes(int range) {
        /*
        initialises a boolean array of size range + 1
        and implements the algorithm
        prints out all the prime numbers between 0 - range
         */
        boolean[] primeNumbers = new boolean[range + 1];
        for (int i = 0; i < range; i++)
            primeNumbers[i] = true;

        for (int j = 2; j * j <= range; j++) {
            if (primeNumbers[j]) {
                for (int k = j * 2; k <= range; k += j) {
                    primeNumbers[k] = false;
                }
            }
        }

        for (int i = 2; i <= range; i++) {
            if (primeNumbers[i])
                System.out.print(i + " ");
        }
    }
}
// end of SieveOfEratosthenes class