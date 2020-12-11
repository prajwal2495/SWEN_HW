package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class BinarySearch begins

public class BinarySearch {

    /*
    Main method
    prompts user to enter size of the array
    fills the array
    sorts the array as it is a pre-requisite for binary search
    prompts the user to enter a target item to be searched
    call searchTarget method to search for target
     */
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements array should have:");
        size = scan.nextInt();
        int[] arr = new int[size];
        /*
        test_case
        for(int i = 0; i < 1000000; i++){
            arr[i] = i;
        }
         */
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter the element to be searched:");
        int target = scan.nextInt();
        int index = searchTarget(arr,target);

        if(index >= 0) {
            System.out.println("Element " + target + " found at index " + index);
        }else{
            System.out.println("Element not found: " + index);
        }
    }


    /*
    method searchTarget
    calculates mid and checks whether the target lies left or right of the array
    depending on the calculation method iterates through the array and tries to find the target
     */
    private static int searchTarget(int[] arr, int target){
        int size = arr.length;
        int mid = size / 2;
        System.out.println(mid);
        if(target == arr[mid]){
            return mid;
        }
        if(target < arr[mid]){
            for(int i = 0; i < mid; i ++){
                if(arr[i] == target)
                    return i;
            }
        }else{
            for(int i = mid; i < size; i++){
                if(arr[i] == target)
                    return i;
            }
        }
        return -1;
    }
}
// end of class BinarySearch
