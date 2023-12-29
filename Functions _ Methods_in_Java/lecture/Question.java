import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(ans);

        // System.out.println(isArmstrong(n));

        for(int i=100;i<1000;i++){
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // 3-digit armstrong number
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n%10;
            sum += rem*rem*rem;
            n=n/10;
        }

        return original == sum;
    }

    // prime number or not
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }

        return c * c > n;
    }
}