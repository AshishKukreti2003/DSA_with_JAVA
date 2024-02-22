import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,2};
        bubbleSort(arr);
        System.out.println("Bubble Sort: "+ Arrays.toString(arr));

        int arr1[] = {1,4,3,5,5,2};
        selectionSort(arr1);
        System.out.println("Selection Sort: "+ Arrays.toString(arr1));

        int arr3[] = {5,4,3,1,2};
        insertionSort(arr3);
        System.out.println("Insertion Sort: "+ Arrays.toString(arr3));
    }

    static void bubbleSort(int[] arr){
        boolean swaped;
        int n = arr.length-1;
        // run the steps in n-1 times
        for (int i = 0; i < arr.length; i++) {
            swaped = false;
            // for each step, max item will come at last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smalled than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] <arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                    break;
            }
        }
    }
}