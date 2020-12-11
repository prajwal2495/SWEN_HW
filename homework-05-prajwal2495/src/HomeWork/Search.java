package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class Search begins
public class Search {
    /*
    Main method
    prompts the user to enter the size of the array
    prompts teh user to enter the elements of the array


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

        System.out.println("Enter the element to be searched:");
        int target = scan.nextInt();

        System.out.println("\nExecuting Linear Search");
        int Lindex = LinearSearch(arr,target);
        if(Lindex >= 0) {
            System.out.println("Element " + target + " found at index " + Lindex);
        }else{
            System.out.println("Element not found: " + Lindex);
        }


        int start = 0, end = size - 1;
        System.out.println("\nExecuting Binary Search");
        Arrays.sort(arr);
        int Bindex = BinarySearchRecursive(arr,start,end,target);
        if(Bindex >= 0) {
            System.out.println("Element " + target + " found at index " + Bindex);
        }else{
            System.out.println("Element not found: " + Bindex);
        }


    }

    /*
    Method LinearSearch
    implemented linear search to depict whether target element is present or not
     */
    private static int LinearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }



    /*
    method BinarySearchRecursive
    Implemented binary search recursively
     */
    private static int BinarySearchRecursive(int[] arr, int start, int end, int target){
        if(start > end)
            return -1;
        int mid = (start + end) / 2;

        if(target == arr[mid])
            return mid;
        else if (target < arr[mid])
            return BinarySearchRecursive(arr, start,mid - 1, target);
        else
            return BinarySearchRecursive(arr, mid + 1, end, target);
    }
}
// end of class Search





/*
while ( start <= end)
{
    int mid = (start + mid) / 2
    if(target == aar[mid]){
        return mid;
    }
    if(target < arr[mid]){
        end = mid - 1;
    }
    else{
        start = mid + 1;
    }
}
return - 1
 */


//    private static int BinarySearch(int[] arr, int target){
//        int size = arr.length;
//        int mid = size / 2;
//        //System.out.println(mid);
//        if(target == arr[mid]){
//            return mid;
//        }
//        if(target < arr[mid]){
//            for(int i = 0; i < mid; i ++){
//                if(arr[i] == target)
//                    return i;
//            }
//        }else{
//            for(int i = mid; i < size; i++){
//                if(arr[i] == target)
//                    return i;
//            }
//        }
//        return -1;
//    }