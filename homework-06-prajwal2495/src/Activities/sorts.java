package Activities;

import java.util.Arrays;

/*
**
@author Prajwal Krishna
**
 */

// class sorts begins
public class sorts {

    /*
  method InsertionSort
  partitions the array into two parts of sorted and unsorted
  swaps the elements in unsorted part of the by comparing it to the elements in sorted part of the array
   */
    public static int[] InsertionSort(int[] array){
        int partition = 0;
        while(partition < array.length){
            int index = partition;
            while(index > 0 && array[index] < array[index - 1]){
                SortUtilities.swap(array, index, index - 1);
                index--;
            }
            partition++;
        }
        return array;
    }

    /*
 method MergeSort
 divides the array into two parts
 1. first array with all the values in even index
 2. second array with al the values in odd index
 recursively calls the even and odds array until it can not be divided anymore and merges the array back together in a sorted fashion.
  */

    public static int[] MergeSort(int[] array){
        if(array.length < 2){
            return array;
        }
        int[][] divide = SortUtilities.divide(array);
        int[] evens = divide[0];
        int[] odds = divide[1];

        int[] SortedEvens = MergeSort(evens);
        int[] SortedOdds = MergeSort(odds);

        int[] mergedSorted = SortUtilities.merge(SortedEvens, SortedOdds);

        return mergedSorted;
    }

    public static void main(String[] args) {
        int[] Data = SortUtilities.makeArray(10);

        System.out.println("------ Insertion Sort ------");
        System.out.println("Array is already sorted: "+ SortUtilities.isSorted(Data));
        System.out.println(Arrays.toString(Data));
        int[] InsertionSortedData = InsertionSort(Data);
        System.out.println("Array is sorted: " + SortUtilities.isSorted(InsertionSortedData));
        System.out.println(Arrays.toString(InsertionSortedData));


        System.out.println("\n----- Merge Sort -----");
        int[] MergeData = SortUtilities.makeArray(10);
        System.out.println("Array is already sorted: "+ SortUtilities.isSorted(MergeData));
        System.out.println(Arrays.toString(MergeData));
        int[] MergedSortedData = MergeSort(MergeData);
        System.out.println("Array is sorted: " + SortUtilities.isSorted(MergedSortedData));
        System.out.println(Arrays.toString(MergedSortedData));;
        }
}
