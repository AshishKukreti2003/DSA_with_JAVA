import java.util.Arrays;
// Matrix is sorted in 
public class BinarySearch_2D{
    public static void main(String[] args) {
        int[][] arr =  {
            {10,20,30,40},
            {12,22,32,42},
            {14,24,34,44},
            {16,26,36,46}
        };

        System.out.println(Arrays.toString(binarySearch(arr, 36)));
    }

    static int[] binarySearch(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            else if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}