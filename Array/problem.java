/* Problem-1 print all element in array

public class problem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int i=0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}


// Problem-2 Sum of all elements in array

public class problem{
    public static void main(String[] args) {
        int[] arr = {10,22,30,33,44};
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}


// Problem-3 Find the maximum element in an array

public class problem{
    public static void main(String[] args) {
        int[] arr = {11,22,34,56,76};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("max: " + max);
    }
}


// Problem-4 minimum element

public class problem{
    public static void main(String[] args) {
        int[] arr = {11,22,10,54,3};
        // int min = Integer.MAX_VALUE;
        int min = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min );
    }
}
    

// Problem-5 Find even and odd/ its count in array

public class problem{
    public static void main(String[] args) {
        int[] arr = {12,2,43,5,6,7};

        // int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2==0){
                // even++;
                System.out.println("Even=" + arr[i]);
            }
            else{
                // odd++;
                System.out.println("odd=" + arr[i]);
            }
        }
        // System.out.println("Even= " + even + ", odd=" + odd);
    }
}


// Problem-6 print an array in reverse

public class problem {

    public static void main(String[] args) {
        int[] arr = {2,34,54,21,9};
        System.out.println("Resversed Array:");
        for(int i =arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
    

// Problem-7 copy one array into another

import java.util.Arrays;

public class problem {

    public static void main(String[] args) {
        int[] arr = {2,43,21,33,9};
        int[] arr1 = new int[arr.length];

        for(int i= 0; i <arr.length; i++){
            arr1[i]=arr[i];
        }
        System.out.println("Copied Array: " + Arrays.toString(arr1));
    }
}
    */

// Problem-8 Second largest elemnt in array

public class problem {

    public static void main(String[] args) {
        int[] arr={7,43,21,22,10,97};

        int max = 0, secMax=0;

        for(int i: arr){
            if(i > max){
                secMax = max;
                max = i;
            }
            else if(i > secMax && i != max){
                secMax = i;
            }
        }
        System.out.println("Second largest= " + secMax);
    }
}