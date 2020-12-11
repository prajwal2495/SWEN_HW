package HomeWork;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class Main begins
public class Main {

    /*
    Main method
    prompts the user to enter starting, ending values of the range and also the increment value
    calls MakeRange method to fill the array accordingly
     */
    public static void main(String[] args) {
        int m, n, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the start point for the range of array elements:");
        m = scan.nextInt();
        System.out.println("Enter the end point for the range of array elements:");
        n = scan.nextInt();
        System.out.println("Enter the increment:");
        k = scan.nextInt();
        makeRange(m,n,k);

    }


    /*
    method MakeRange
    determines the size of the array based on the range and increment values given
    prompts the user to enter a target and if target is greater than 0
    calls Linear and binary search
    compares the time taken by both the logics.
     */
    private static void makeRange(int start, int end, int inc){
        int size = ((end - start) / inc) + 1;
        System.out.println("Size of the array: "+size);
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the elements of the array");
        int index = 0;
        for(int i = start; i <= end; i += inc){
            arr[index] = i;
            index++;
        }
        Arrays.sort(arr);
        int target = Integer.MAX_VALUE;
        while (target >= 0){
            System.out.println("\nEnter the element to be searched:");
            System.out.println("Enter -1 to stop execution");
            target = scan.nextInt();
            long Linear_start_time = System.currentTimeMillis();
            LSearch(arr,target);
            long Linear_end_time = System.currentTimeMillis();
            System.out.println("Linear search took "+ (Linear_end_time - Linear_start_time)+"ms to execute");


            long Binary_start_time = System.currentTimeMillis();
            int indexB = BSearch(arr,target);
            if(indexB < 0) {
                System.out.println("\ntarget " + target + " not found");
            }else{
                System.out.println("\nTarget " + target + " found at index "+indexB);
            }
            long Binary_end_time = System.currentTimeMillis();
            System.out.println("Binary search took "+ (Binary_end_time - Binary_start_time)+"ms to execute");
            }
    }

    /*
    method BSearch
    calculates mid and checks whether the target lies left or right of the array
    depending on the calculation method iterates through the array and tries to find the target
    */

    private static int BSearch(int[] arr, int target) {
        int start = 0,end = arr.length;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    /*
    method LSearch
    implemented linear search to depict whether target element is present or not
    */

    private static void LSearch(int[] arr, int target){

        System.out.println("\nExecuting Linear search:");

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == target){
                System.out.println("Element "+ target + " found at index "+ i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
// class Main ends





//        System.out.println("\nexecuting Binary search:");
//        int size = arr.length;
//        int mid = size / 2;
//        //System.out.println(mid);
//        if(target == arr[mid]){
//            System.out.println("Element " + target + " found at index "+ mid);
//            return;
//        }
//        if(target < arr[mid]){
//            for(int i = 0; i < mid; i ++){
//                if(arr[i] == target) {
//                    System.out.println("Element " + target + " found at index " + i);
//                    return;
//                }
//            }
//        }else{
//            for(int i = mid; i < size; i++){
//                if(arr[i] == target) {
//                    System.out.println("Element " + target + " found at index " + i);
//                    return;
//                }
//            }
//        }
//        System.out.println("Element not found");




