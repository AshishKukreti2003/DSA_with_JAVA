import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args){
        int[] arr = {1,3,4,6};
        change_value(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static void change_value(int[] num){
        num[0] = 0; // if you make a change to the object via this reference variable, same object will be change
    }
}
