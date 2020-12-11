package Activities;

import java.util.Scanner;

/*
**
@author Prajwal Krishna
**
 */

// class SearchTheArray begins
public class SearchTheArray {

    /*
    method search
    implemented linear search to depict whether target element is present or not
     */
    public static boolean search(int[] a, int target){
        for(int i : a){
            if(i == target)
                return true;
        }
        return false;
    }

    /*
    main method
    fills the array
    prompts the user to enter a target
    call search function with array and target as args
     */
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = i;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value to be searched:");
        int target = scan.nextInt();
        boolean result = search(arr,target);
        System.out.println(result);
    }
}
// end of class SearchTheArray
