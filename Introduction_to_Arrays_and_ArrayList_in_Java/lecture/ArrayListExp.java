import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(78);
        list.add(780);
        list.add(708);

        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        // input
        for(int i=0;i<5;i++){
            num.add(sc.nextInt());
        }

        // output
        for(int i=0;i<5;i++){
            System.out.println(num.get(i));
        }

        System.out.println(num);
    }
}
