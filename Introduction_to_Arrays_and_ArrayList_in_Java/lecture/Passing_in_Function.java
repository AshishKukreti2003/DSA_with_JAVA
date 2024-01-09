import java.util.Arrays;

class Passing_in_Function {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        System.out.println(Arrays.toString(num));
        
        change(num);
        System.out.println(Arrays.toString(num));

    }

    public static void change(int[] arr){
        arr[0] = 100;
    }
}