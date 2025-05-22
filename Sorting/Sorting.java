public class Sorting {

    // bubble Sort technique
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for(int i = 0; i < n - 1; i++){
            swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
        }
    }

    // Selection sort technique

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion sort technique

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key <= arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return ;
    }

    // To print the Array
    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Main Function
    public static void main(String[] args) {
        int[] arr = {65,25,12,22,11};
        System.out.println("Sorted Array for bubble sort:");
        bubbleSort(arr);
        printArray(arr);
        

        System.out.println("\nSorted Array for selection sort:");
        selectionSort(arr);
        printArray(arr);

        System.out.println("\nSorted Array for insertion sort:");
        insertionSort(arr);
        printArray(arr);
    }
}
