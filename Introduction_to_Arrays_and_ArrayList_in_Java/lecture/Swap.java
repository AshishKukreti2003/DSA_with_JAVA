import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // System.out.println("Array: "+Arrays.toString(arr));
        // swap(arr, 0, 4);
        // System.out.print("After Swaping: "+Arrays.toString(arr));

        Reverse(arr);
        System.out.print("Reverse: "+ Arrays.toString(arr));
    }

    public static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
