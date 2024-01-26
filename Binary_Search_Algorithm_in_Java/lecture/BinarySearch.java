public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        // int ans = BinarySearch(arr, target);
        // System.out.println(ans);
        System.out.println(BinarySearch(arr, target));
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}