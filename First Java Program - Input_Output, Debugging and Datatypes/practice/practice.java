import java.util.*;

public class practice {
    /*
     * 
     * 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
     * (Use if conditions)
     * 5. Take 2 numbers as input and print the largest number.
     * 6. Input currency in rupees and output in USD.
     * 7. To calculate Fibonacci Series up to n numbers.
     * 8. To find out whether the given String is Palindrome or not.
     * 9. To find Armstrong Number between two given number.
     */
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input
        // from the user.

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is Even");
        } else
            System.out.println("Number is Odd");

        // 2. Take name as input and print a greeting message for that particular name.
        System.out.print("Enter the Name: ");
        String name = sc.next();
        System.out.println("Good Morning " + name);

        // 3. Write a program to input principal, time, and rate (P, T, R) from the user
        // and find Simple Interest.
        /* SI = (P*R*T)/100 */
        System.out.print("Enter the principal amount: ");
        int prin = sc.nextInt();
        System.out.print("Enter the time: ");
        int time = sc.nextInt();
        System.out.print("Enter the rate: ");
        int rate = sc.nextInt();

        double SI = (prin * rate * time) / 100;
        System.out.print("The Simple Interest is: " + SI);

        sc.close();
    }
}
