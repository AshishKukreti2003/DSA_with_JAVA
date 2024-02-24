import java.util.Arrays;

public class Cycle_Sort {
    public static void main(String[] args){
        int[] arr = {1,3,4,5,2};
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
