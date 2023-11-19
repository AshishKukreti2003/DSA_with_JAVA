import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // type casting
        // int num = (int) 56.87f;
        // System.out.println(num);

        // automatic type promotion in expressions
        // int a = 256;
        // byte b= (byte) a;
        // System.out.println(b);

        // byte x = 50;
        // byte y = 40;
        // byte z = 100;
        // int op = x*y/z;
        // System.out.println(op);

        // int number = 'A';
        // System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5456;
        float f = 56.76f;
        double d = 1324.1234534;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

        sc.close();
    }
}
