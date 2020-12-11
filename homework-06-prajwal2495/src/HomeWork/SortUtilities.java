package HomeWork;

import java.util.Random;

/*
**
@author Prajwal Krishna
**
 */

//class SortUtilities begins
public class SortUtilities {
    // used to generate a random number
    private static final Random n = new Random(1);

    // used to check whether the array is sorted or not
    public static boolean isSorted(int[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1])
                return false;
        }
        return true;
    }

    // swaps the values of array at index a and b
    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // creates an array of given size
    public static int[] makeArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i ++){
            array[i] = n.nextInt(size);
        }
        return array;
    }

    // used to divide the array when merge sort is called
    public static int[][] divide(int[] array){
        int[] odds = new int[array.length / 2];
        int[] evens = new int[array.length - odds.length];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                evens[evenIndex] = array[i];
                evenIndex++;
            }else{
                odds[oddIndex] = array[i];
                oddIndex++;
            }
        }

        int[][] both = new int[2][];
        both[0] = evens;
        both[1] = odds;
        return both;
    }

    // used to merge the odd and even array when merge sort is called
    public static int[] merge(int[] a, int[] b) {
        if (a.length == 0) {
            return b;
        } else if (b.length == 0) {
            return a;
        }

        int[] merged = new int[a.length + b.length];

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[i + j] = a[i];
                i++;
            } else {
                merged[i + j] = b[j];
                j++;
            }


            if (i < a.length) {
                System.arraycopy(a, i, merged, i + j, a.length - i);
            } else if (j < b.length) {
                System.arraycopy(b, j, merged, i + j, b.length - j);
            }
        }

        return merged;
    }

    //used to concatenate N arrays into a single array
    public static int[] cat(int[] ... arrays){
        int totalSize = 0;
        int eachArrayCurrentIndex = 0;

        for(int[] eachArray : arrays){
            totalSize = totalSize + eachArray.length;
        }

        int[]  concatenatedArray = new int[totalSize];

        for(int[] eachArray : arrays){
            System.arraycopy(eachArray, 0, concatenatedArray, eachArrayCurrentIndex, eachArray.length);
            eachArrayCurrentIndex = eachArrayCurrentIndex + eachArray.length;
        }

        return concatenatedArray;
    }


}
// end of class SortUtilities

