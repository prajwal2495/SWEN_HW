package practicum1;

import util.*;

import java.util.Arrays;
import java.util.Scanner;

public class Psorts {

    public static int[][] split(int[] arr){
        int left_size = arr.length / 3;
        int middle_size = (arr.length / 3);
        int right_size = arr.length - ( left_size + middle_size);
        int left_index = 0, right_index = 0, middle_index = 0;
        int[] left = new int[left_size];
        int[] middle = new int[middle_size];
        int[] right = new int[right_size];

        for(int i = 0; i < left_size; i++){
            left[i] = arr[i];
            left_index++;
            //System.out.println(Arrays.toString(left));
        }
        //System.out.println(left_size);
        //System.out.println(Arrays.toString(left));


        for(int i = 0; i < middle_size; i++){
            middle[i] = arr[i + (left_index)];
            middle_index++;
            //System.out.println(Arrays.toString(middle));
        }
//        System.out.println(middle_size);
//        System.out.println(Arrays.toString(middle));


        for(int i = 0; i < right_size; i++){
            //right[i] = arr[(middle_index + 1)];
            right[i] = arr[(left_index + middle_index) + i];
            right_index++;
            //System.out.println(Arrays.toString(right));
        }
   //     System.out.println(right_size);
  //      System.out.println(Arrays.toString(right));

        int[][] mergedArray = new int[3][];
        mergedArray[0] = left;
        mergedArray[1] = middle;
        mergedArray[2] = right;
        return  mergedArray;

    }

    public static int[] jimSort(int[] arr){
        int[] sorted = new int[arr.length];
        if(arr.length <= 7) {
            sorted = util.Sorts.quicksort(arr);
        }else{
            int[][] sort = split(arr);
            int[] left = jimSort(sort[0]);
            int[] middle = jimSort(sort[1]);
            int[] right = jimSort(sort[2]);
            sorted = util.SortUtilities.merge(left,middle);
            sorted = util.SortUtilities.merge(sorted,right);
        }
        return sorted;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = scan.nextInt();
        int[] arr = util.SortUtilities.makeArray(size);
//        System.out.println("Enter array elements:");
//        for(int i = 0;i < size; i++){
//            arr[i] = scan.nextInt();
//        }
        int[] sorted = jimSort(arr);
        System.out.println(Arrays.toString(sorted));
        System.out.println(util.SortUtilities.sorted(sorted));
    }
}
