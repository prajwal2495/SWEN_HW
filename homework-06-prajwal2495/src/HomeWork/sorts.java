package HomeWork;

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

    /*
    method BubbleSort
    checks the value at index and index + 1 swaps if necessary
    process is continued until the hole is sorted.
     */
    public static int[] BubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /*
    method QuickSort
    1. considers a pivot value
    2. divides the array into 3 array based on pivot value
        2.1 array with values less than pivot value
        2.2 array with values equal to pivot value
        2.3 array with values grater than pivot
    3. array with values less than pivot value is sorted by swapping if necessary
    4. array with values grater than pivot is sorted by swapping if necessary
    5. Finally all the 3 arrays are merged which will be sorted.
     */
    public static int[] QuickSort(int[] array){
        int lessThanPivot = 0, pivot = 0, greaterThanPivot = 0,equalToPivot = 0;
        int lessThanPivotIndex = 0, equalToPivotIndex = 0, greaterThanPivotIndex = 0;
        int[] concatenatedArray = new int[array.length];

        if(array.length < 2){
            return array;
        }else if(array.length == 2){
            if(array[0] > array[1]){
                SortUtilities.swap(array, 0 ,1);
                return array;
            }else if(array[0] == array[1]){
                return array;
            }else {
                return array;
            }
        }else{
            for(int i = 0; i < array.length; i++){
                if(array[i] < array[pivot]){
                    lessThanPivot++;
                }else if(array[i] == array[pivot]){
                    equalToPivot++;
                }else{
                    greaterThanPivot++;
                }
            }

            int[] lessThanPivotArray = new int[lessThanPivot];
            int[] equalToPivotArray = new int[equalToPivot];
            int[] greaterThanPivotArray = new int[greaterThanPivot];

            for(int i = 0; i < array.length; i++){
                if(array[i] < array[pivot]){
                    lessThanPivotArray[lessThanPivotIndex] = array[i];
                    lessThanPivotIndex++;
                }else if(array[i] == array[pivot]){
                    equalToPivotArray[equalToPivotIndex] = array[i];
                    equalToPivotIndex++;
                }else{
                    greaterThanPivotArray[greaterThanPivotIndex] = array[i];
                    greaterThanPivotIndex++;
                }
            }

            concatenatedArray = SortUtilities.cat(QuickSort(lessThanPivotArray), equalToPivotArray, QuickSort(greaterThanPivotArray));
        }

        return concatenatedArray;
    }


    /*
    Main method
    calls all the sorting function for testing purposes.
     */
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

        System.out.println("\n----- Bubble Sort -----");
        int[] BubbleData = SortUtilities.makeArray(10);
        System.out.println("Array is already sorted: "+ SortUtilities.isSorted(BubbleData));
        System.out.println(Arrays.toString(BubbleData));
        int[] BubbleSortedData = MergeSort(BubbleData);
        System.out.println("Array is sorted: " + SortUtilities.isSorted(BubbleSortedData));
        System.out.println(Arrays.toString(BubbleSortedData));


        System.out.println("\n----- Quick Sort -----");
        int[] QuickData = SortUtilities.makeArray(10);
        System.out.println("Array is already sorted: "+ SortUtilities.isSorted(QuickData));
        System.out.println(Arrays.toString(QuickData));
        int[] QuickSortedData = QuickSort(QuickData);
        System.out.println("Array is sorted: " + SortUtilities.isSorted(QuickSortedData));
        System.out.println(Arrays.toString(QuickSortedData));
    }
}
// end of class sorts