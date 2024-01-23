import java.util.*;
public class Search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr ={
            {34,56,78},
            {23,67,89,5},
            {42,61,73}
        };
        int target = 73;
        int[] ans = search2D(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max2D(arr));
    }

    static int max2D(int[][] arr){
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int[] search2D(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
