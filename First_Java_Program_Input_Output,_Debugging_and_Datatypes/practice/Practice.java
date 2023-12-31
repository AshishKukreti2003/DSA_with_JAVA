import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 1. Write a program to print whether a number is even or odd, also take input
        // from the user.
        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        // if (a % 2 == 0) {
        //     System.out.println("Number is Even");
        // } else
        //     System.out.println("Number is Odd");

// 2. Take name as input and print a greeting message for that particular name.
        // System.out.print("Enter the Name: ");
        // String name = sc.next();
        // System.out.println("Good Morning " + name);

// 3. Write a program to input principal, time, and rate (P, T, R) from the user
        // and find Simple Interest.
        /* SI = (P*R*T)/100 */
        // System.out.print("Enter the principal amount: ");
        // double prin = sc.nextDouble();
        // System.out.print("Enter the time: ");
        // double time = sc.nextDouble();
        // System.out.print("Enter the rate: ");
        // double rate = sc.nextDouble();

        // double SI = (prin * rate * time) / 100;
        // System.out.println("The Simple Interest is: " + SI);

// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
        // System.out.print("Enter the 1st number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the 2nd number: ");
        // int num2 = sc.nextInt();
        // System.out.println("The + is: " + (num1 + num2));
        // System.out.println("The - is: " + (num1 - num2));
        // System.out.println("The * is: " + (num1 * num2));
        // System.out.println("The / is: " + (num1 / num2));

// 5. Take 2 numbers as input and print the largest number.
        // System.out.print("Enter the 1st number: ");
        // int x = sc.nextInt();
        // System.out.print("Enter the 2nd number: ");
        // int y = sc.nextInt();
        // if (x > y) {
        //     System.out.println("Largest number is: " + x);
        // } else
        //     System.out.println("Largest number is: " + y);

// 6. Input currency in rupees and output in USD.
        // System.out.print("Enter the rupees: ");
        // double rupee = sc.nextDouble();
        // double usd = rupee / 85;
        // System.out.println("USD of " + rupee + "rupees is $" + usd);

// 7. To calculate Fibonacci Series up to n numbers.
        System.out.println("Enter the number: ");
        int op = sc.nextInt();
        int temp = 0;
        int e = 0, f = 1;
        for (int i = 0; i <= op; i++) {
            System.out.print(e + " ");
            temp = e + f;
            e = f;
            f = temp;
        }
// 7.(i) Print nth number of fibonacci series

    int n = sc.nextInt();

    int a = 0, b = 1, c = 0;

    if (n == 0)
        System.out.println("The 0th Fibonacci number is: 0");
    else if (n == 1)
        System.out.println("The 1st Fibonacci number is: 1");
    else {
        for (int i = 2; i <= n; i++) {
            c = a+b;
            a =b;
            b=c;
        }
        System.out.println("The " + n + "th Fibonacci number is: " + c);
    }

// 8. To find out whether the given String is Palindrome or not.
        // System.out.println("Enter the String: ");
        // String str = sc.nextLine();
        // String org_str = str;
        // String rev ="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev+=str.charAt(i);
        // }
        // // System.out.println(rev); // reverse a String
        // if(org_str.equals(rev)){
        //     System.out.println(org_str+ " is a Palindrome String");
        // }
        // else
        //     System.out.println(org_str+ " is not a Palindrome String");

// 9. To find Armstrong Number between two given number.
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        for(int i=num1;i<num2;i++){
            int check = i, rem, sum=0;
            while(check != 0){
                rem = check%10;
                sum += rem*rem*rem;
                check = check/10;
            }
            if(sum ==i){
                System.out.println(i+" is a Armstrong number");
            }
        sc.close();
        }
    }
}
