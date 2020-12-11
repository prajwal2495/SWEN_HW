package util;

import static util.SortUtilities.*;

/**
 * Implementations of some common sorts.
 */
public class Sorts {
    /**
     * Performs an in-place sort using Insertion Sort.
     *
     * @param array The array to be sorted in-place.
     */
    public static void insertionSort(int[] array) {
        int partition = 0;
        while(partition < array.length) {
            int index = partition;
            while(index > 0 && array[index] < array[index-1]) {
                swap(array, index, index-1);
                index--;
            }
            partition++;
        }
    }

    /**
     * Returns a copy of the array that has been sorted using Merge Sort. The
     * original array is unmodified.
     *
     * @param array The array to be copied and sorted.
     *
     * @return A sorted copy of the array.
     */
    public static int[] mergeSort(int[] array) {
        if(array.length < 2) {
            return array;
        } else {
            // divide
            int[][] divided = divide(array);
            int[] evens = divided[0];
            int[] odds = divided[1];
            // recursively sort; this will return a sorted copy of the
            // original array...
            int[] sortedEvens = mergeSort(evens);
            int[] sortedOdds = mergeSort(odds);
            // merge the sorted copies
            int[] merged = merge(sortedEvens, sortedOdds);
            return merged;
        }
    }

    /**
     * Returns a copy of the array that has been sorted using Quicksort. The
     * original array is unmodified.
     *
     * @param array The array to be copied and sorted.
     *
     * @return A sorted copy of the array.
     */
    public static int[] quicksort(int[] array) {
        // no need to sort an array with 0 or 1 elements in it
        if(array.length < 2) {
            return array;
        }

        // always choose index 0 as the pivot
        int pivot = array[0];
        // count the number of values less than, equal to, or greater than
        // the pivot
        int lessCount = 0;
        int equalCount = 0;
        int greaterCount = 0;

        // count the number of values that are less than, equal to, or greater
        // than the pivot
        for(int i=0; i<array.length; i++) {
            if(array[i] < pivot) {
                lessCount++;
            } else if(array[i] > pivot) {
                greaterCount++;
            } else {
                equalCount++;
            }
        }

        // create an array large enough to hold the values in each category
        int[] less = new int[lessCount];
        int[] equal = new int[equalCount];
        int[] greater = new int[greaterCount];

        // keep track of the next index into which a value should be copied
        // in each array
        int lessIndex = 0;
        int equalIndex = 0;
        int greaterIndex = 0;

        // copy all of the values into the correct array
        for(int i=0; i<array.length; i++) {
            if(array[i] < pivot) {
                less[lessIndex++] = array[i];
            } else if(array[i] > pivot) {
                greater[greaterIndex++] = array[i];
            } else {
                equal[equalIndex++] = array[i];
            }
        }

        // recursively sort the less and greater arrays. this will return a
        // sorted copy of each array.
        int[] sortedLess = quicksort(less);
        int[] sortedGreater = quicksort(greater);

        // cat the
        return cat(sortedLess, equal, sortedGreater);
    }
}
