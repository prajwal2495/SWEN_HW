package practicum1;

import java.util.Arrays;

public class ArrayUtilitiesMain {
    public static void main(String[] args) {
        int[] arr = new int[25];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Original Array:");
        ArrayUtilities.printArray(arr);

        System.out.println("Copy Array:");
        int[] copyArr = ArrayUtilities.copyArray(arr);
        System.out.println(Arrays.toString(copyArr));

        System.out.println("Added 5:");
        arr = ArrayUtilities.addToArray(arr, 5);
        System.out.println(Arrays.toString(arr));

        System.out.println("Evens Original:");
        arr = ArrayUtilities.evenOnlyArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Evens Copy:");
        copyArr = ArrayUtilities.evenOnlyArray(copyArr);
        System.out.println(Arrays.toString(copyArr));
    }
}
