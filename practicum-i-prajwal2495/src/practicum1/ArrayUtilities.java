package practicum1;

import java.util.Arrays;

public class ArrayUtilities {

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static int[] copyArray(int[] arr){
        int size = arr.length;
        int[] arrCopy = Arrays.copyOf(arr,size);
        return arrCopy;
    }

    public static int[] addToArray(int[] arr, int n){
        int size = arr.length;
        for(int i = 0; i < size; i++){
            arr[i] = arr[i] + n;
        }
        return arr;
    }

    public static int[] evenOnlyArray(int[] arr){
        int countEven = 0;
        int size = arr.length;
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                countEven++;
            }
        }
        int[] evenArray = new int[countEven];
        int evenIndex = 0;
        for (int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                evenArray[evenIndex] = arr[i];
                evenIndex++;
            }
        }
        return evenArray;
    }
}
