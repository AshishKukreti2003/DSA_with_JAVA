import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
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
}