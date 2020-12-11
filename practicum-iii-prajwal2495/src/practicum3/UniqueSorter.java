package practicum3;
import util.*;

import java.util.Arrays;

public class UniqueSorter {

    public static int[] sortAscending(int[] array, int size){

        int i , j, count = 0,temp;
        int[] arrayCopy = new int[size];

        for(i = 0 ; i < size; i++){
            for(j = i + 1; j < size; j++){
                if(array[i] == arrayCopy[j]){
                    break;
                }
            }
            if(j == size){
                arrayCopy[count++] = array[i];
            }
        }

        for (i = 0; i < count - 1; i++){
            for(j = i + 1; j < count; j++){
                if(arrayCopy[i] > arrayCopy[j]){
                    temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[j];
                    arrayCopy[j] = temp;
                }
            }
        }
        return arrayCopy;
    }

    public static int[] sortDescending(int[] array, int size){

        int i , j, count = 0,temp;
        int[] arrayCopy = new int[size];

        for(i = 0 ; i < size; i++){
            for(j = i + 1; j < size; j++){
                if(array[i] == arrayCopy[j]){
                    break;
                }
            }
            if(j == size){
                arrayCopy[count++] = array[i];
            }
        }

        for (i = 0; i < count - 1; i++){
            for(j = i + 1; j < count; j++){
                if(arrayCopy[i] < arrayCopy[j]){
                    temp = arrayCopy[i];
                    arrayCopy[i] = arrayCopy[j];
                    arrayCopy[j] = temp;
                }
            }
        }
        return arrayCopy;
    }


    public static void main(String[] args) {
        int[] unsortedArray = util.SortUtilities.makeArray(15);

        int[] sortedAscendingArray = sortAscending(unsortedArray,unsortedArray.length);
        System.out.println("unsorted: "+ Arrays.toString(unsortedArray));
        System.out.println("sorted ascending: "+Arrays.toString(sortedAscendingArray));

        int[] sortedDescendingArray = sortDescending(unsortedArray,unsortedArray.length);
        System.out.println("unsorted: "+ Arrays.toString(unsortedArray));
        System.out.println("sorted descending: "+Arrays.toString(sortedDescendingArray));
    }
}
