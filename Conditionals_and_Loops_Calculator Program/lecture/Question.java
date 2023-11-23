import java.util.Scanner;

public class Question {
    public static void main(String[] args){
// Q1. Find the largest of the three number
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.println("Maximum number is: "+ max);
        
        // OR

        // int max = Math.max(c,Math.max(a, b));
        // System.out.println("Maximum number is: "+ max);

// Q2. Character Case check where it is UPPERCASE or lowercase
        // char ch = sc.next().trim().charAt(0);
        // if(ch >= 'a' && ch <= 'z'){
        //     System.out.println("lowercase");
        // }
        // else
        //     System.out.println("Uppercase");
        
// Q3. Calculate how many time integer n occuring in a number
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // System.out.print("Enter the integer: ");
        // int integer = sc.nextInt();
        // int count=0;
        // while(num>0){
        //    int rem;
        //    rem = num%10;
        //    if(rem==integer){
        //         count++;
        //     }
        //     num=num/10;
        // }
        // System.out.println(count);

// Q4. Reverse a number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ans =0;;
        while(num>0){
            int rem = num%10;
            num /=10;
            ans = ans*10+rem;
        }
        System.out.println("Reverse a number: " + ans);
        
        sc.close();
    }
}
