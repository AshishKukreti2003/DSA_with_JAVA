import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        int ans1 = sum(4,5);
        System.out.println(ans1);

        int ans2 = sum(4,5,1);
        System.out.println(ans2);

        fun("5", "Ashish", "Op");

        fun(3,6,4,5,7,9);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b ){
        return a+b;
    }

    static int sum(int a, int b, int c ){
        return a+b+c;
    }
}
