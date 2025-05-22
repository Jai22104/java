// Optimize approach
// move zeros after the non-zero element in an array.
/* 
public class Question {
    public static void moveZeros(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int[] arr = {5,6,0,2,0,0,9};
        moveZeros(arr);
    }
}



// Brootforce Method

public class Question {
    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int[] result = new int[n]; 
        int index = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 0, 2, 0, 0, 9};
        moveZeros(arr);
    }
}



// Check wether the array is sorted or not if not then sort it.

import java.util.Arrays;

public class Question {
    public static boolean check(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){

            }else{
                return false;
            }
        }
        return true;
    }

    public static int[] sort(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = arr[n - i - 1];
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(check(arr));
        System.out.println(Arrays.toString(sort(arr)));

    }
}

*/

// Second Approach

import java.util.Arrays;

public class Question {
    public static void check(int[] arr){
        int n = arr.length;
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is already sorted.");
        } else {
            Arrays.sort(arr);
            System.out.print("Sorted Arraya : " + Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,4,3,2,1,6,7};
        check(arr);
    }
}