import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter the two number: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2!=0){
                        ans = num1/num2;
                    }
                }
                if(op == '%'){
                    ans = num1%num2;
                }
            }
            else if(op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("You enter invalid operator!!");
            }
            System.out.println("The answer is: " + ans);    
        }

        sc.close();
    }
}
