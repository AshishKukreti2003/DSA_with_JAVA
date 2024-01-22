public class Searching_in_Range {
    public static void main(String[] args) {
        int arr[] = {34,56,7,89,45,34,56,6};
        int start = 2;
        int end = 6;
        int search = 45;
        System.out.println(searchRange(arr, start, end, search));
    }

    static int searchRange(int[] arr, int start, int end, int search){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<end;i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
}
