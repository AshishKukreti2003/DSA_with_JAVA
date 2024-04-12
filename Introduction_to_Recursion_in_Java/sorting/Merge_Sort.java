import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {9,6,7,3,5,1,3,7};
        arr = mergerSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {6,5,4,3,8,9,2};
        mergeSort_InPlcae(arr1, 0, arr1.length);
        System.out.println(Arrays.toString(arr1));
    }

    static int[] mergerSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergerSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergerSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i=0,j=0,k =0;
        while (i < first.length && j < second.length) {
            if(first[i] < second [j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    static void mergeSort_InPlcae(int[] arr, int s , int e){
        if(e-s == 1){
            return;
        }

        int mid = (e+s)/2;
        mergeSort_InPlcae(arr, s, mid);
        mergeSort_InPlcae(arr, mid, e);

        merge_InPlace(arr, s, mid, e);
    }

    private static void merge_InPlace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while (i<mid && j<e) {
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        } 
        while (j<e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            arr[l+s] = mix[l];
        }
    }
}
