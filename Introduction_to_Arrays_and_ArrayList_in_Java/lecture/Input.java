import java.lang.reflect.Array;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        // arr[0] = 9;
        // arr[1] = 3;
        // arr[2] = 56;
        // System.out.println(arr[2]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        // printing array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        
        System.out.println(Arrays.toString(arr));

        String[] str = new String[3];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
