import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimension {
    public static void main(String[] args) {
        // int[][] arr = new int[3][2];

        // int[][] arr1 = {
        // {1,2,3}, // 0th index
        // {4,5}, // 1st index
        // {6,7,8,9} // 2nd index
        // };

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
