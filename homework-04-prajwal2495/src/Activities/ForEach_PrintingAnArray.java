package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class ForEach_FillingAnArray begins

public class ForEach_PrintingAnArray {

    /*
    main method :
    Prompts the user to enter array size and calls fillTheArray method
     */
    public static void main(String[] args){
        int arr_size;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        arr_size = scan.nextInt();
        int[] arr = fillTheArray(arr_size);

        // printing the array using for each
        System.out.println("contents of the array :");
        for(int i : arr){
            System.out.println(i);
        }
    }

    // method fill the array to store values into array using for loop
    public static int[] fillTheArray(int size){
        int[] result = new int[size];
        for(int i = 0; i < size; i ++){
            result[i] = 10 * i;
        }
        return result;
    }
}
// class ForEach_FillingAnArray ends