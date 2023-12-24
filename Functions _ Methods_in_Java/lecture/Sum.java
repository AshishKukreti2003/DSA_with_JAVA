import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the 1st number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the 2nd number: ");
        // int num2 = sc.nextInt();
        // int sum = num1+ num2;
        // System.out.print("Sum is: "+ sum);

        // sum();

        // int ans = sum2();
        // System.out.println("The sum is: "+ ans);

        int ans = sum3(10,70);
        System.out.println("The sum is: "+ ans);

    }
    
    // pass the value of number when you are calling th method in main()
    static int sum3(int a , int b){
        int sum = a+b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        return sum;

    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1+ num2;
        System.out.println("Sum is: "+ sum);
    }
}
