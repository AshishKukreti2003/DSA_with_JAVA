import java.lang.reflect.Array;
import java.util.Arrays;

public class Variable_Length_Arguments {
    public static void main(String[] args){
        fun(4,5,6,3,245);
        
        mutliple(5, 3, "5", "Ashish", "Op");
    }

    static void mutliple(int a, int b, String ...s){
        System.out.println(Arrays.toString());
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
