public class Celling{
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,14,17,19};
        int target = 8;
        System.out.println(BinarySearch(arr, target));
    }

static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int[] extra = new int[end];
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid] == target)
                return arr[mid];
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return arr[start];
    }
}