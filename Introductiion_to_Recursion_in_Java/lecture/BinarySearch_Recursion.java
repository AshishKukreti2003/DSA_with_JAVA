public class BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] arr = { 3,6,7,8,9};
        int target = 8;
        System.out.println(BinarySearch(arr, target));

        System.out.println(BinarySearch_Recursion(arr, target, 0, arr.length-1));
    }

    static int BinarySearch_Recursion(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]>target){
            return BinarySearch_Recursion(arr, target, s, mid-1);
        }
        return BinarySearch_Recursion(arr, target, mid+1, e);
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
