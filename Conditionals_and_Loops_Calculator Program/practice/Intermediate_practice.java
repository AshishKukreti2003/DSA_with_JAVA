import java.util.Scanner;

public class Intermediate_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 1. Factorial Program In Java
        // int num = 10;
        // int result =1;
        // int count =1;
        // while(num>=count){
        // result*=count;
        // count++;
        // }
        // System.out.println(result);

// 2. Calculate Average Of N Numbers
        // double num = sc.nextDouble();
        // double sum =0;
        // int count =0;
        // while(num>count){
        // double value = sc.nextDouble();
        // sum+=value;
        // count++;
        // }
        // double avg = sum/num;
        // System.out.println(avg);

// 3. Calculate Discount Of Product
        // double originalPrice = 100.0; // Original price of the product
        // double discountPercentage = 40.0; // Discount percentage

        // double discount = originalPrice * (discountPercentage / 100);
        // System.out.println("The discount on the product is: $" + discount);

// 4. Calculate Distance Between Two Points
        // int point1 = 100;
        // int point2 = 120;
        // int Distance;
        // if(point1>point2){
        // Distance = point1 - point2;
        // }
        // else
        // Distance = point2 - point1;
        // System.out.println("The Distance Between "+ point1 +" and "+ point2+" is: "+
        // Distance);

// 5. Power In Java
        // int num = 2;
        // int exponent = 10;
        // double power = Math.pow(num, exponent);
        // System.out.println(power);

// 6. Calculate Batting Average
        // int balls = 2000;
        // int out = 8;
        // double ba = balls/out;
        // System.out.println(ba);

// 7. Compound Interest Java Program
        // int initial_amount = 70000;
        // double rate = 0.0710;
        // int timesCompounded = 100;
        // double years = 1.1;
        // double amount = initial_amount * Math.pow(1 + (rate / timesCompounded), years
        // * timesCompounded);
        // double ci = amount - initial_amount;
        // System.out.println(ci);
        // System.out.println(amount);

// 8. Sum Of N Numbers
        // int n = sc.nextInt();
        // int sum = 0;
        // int count = 1;
        // while(count<=n){
        // int num = sc.nextInt();
        // sum +=num;
        // count++;
        // }
        // System.out.println(sum);

// 9. Armstrong Number In Java
        // int num = sc.nextInt();
        // int result = num;
        // int length = String.valueOf(num).length();
        // // System.out.println(length);
        // int sum = 0;
        // while (num>0) {
        //     int digit = num%10;
        //     sum += Math.pow(digit, length);
        //     num /= 10;
        // }
        // if(sum == result){
        //     System.out.println(result+" is a Armstrong number");
        // }
        // else
        //     System.out.println(result+" is not a Armstrong number");

//  10. Find Ncr & Npr
        // System.out.println("nPr");
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the value of r: ");
        // int r = sc.nextInt();
        // int count =1;
        // int mul_a =1;
        // int mul_b = 1;
        // int n_minus_r = n-r;
        // while(n>=count){
        //         mul_a*=count;
        //         count++;
        // }
        // System.out.println(mul_a);
        // count =1;
        // while (n_minus_r>=count) {
        //         mul_b*=count;
        //         count++;
        // }
        // System.out.println(mul_b);
        // int result = mul_a/mul_b;
        // System.out.println(result);
        // int result =1;
        // int count =1;
        // while(num>=count){
        // result*=count;
        // count++;
        // }
        // System.out.println(result);

        // System.out.println("nCr");
        // System.out.println("Enter the value of n: ");
        // int n_1 = sc.nextInt();
        // System.out.println("Enter the value of r: ");
        // int r_1 = sc.nextInt();
        // int mul_a=1, mul_b = 1, mul_r=1;
        // int count = 1;
        // int n_minus_r_a = n_1 - r_1;
        // while (n_1>=count) {
        //         mul_a*=count;
        //         count++;
        // }

        // count = 1;
        // while (n_minus_r_a>=count) {
        //         mul_b*=count;
        //         count++;
        // }
        // count = 1;
        // while (r_1>=count) {
        //         mul_r*=count;
        //         count++;
        // }

        // int down = mul_r*mul_b;
        // int result_a = mul_a/down;
        // System.out.println(result_a);

// 11. Find if a number is palindrome or not
        // System.out.println("Enter the number");
        // int n = sc.nextInt();
        // int result = 0;
        // int org = n;
        // while (n>0) {
        //         int rem = n%10;
        //         result = result*10+rem;
        //         n/=10;   
        // }

        // if(org == result){
        //         System.out.println("Number is palindrome number");
        // }
        // else
        //         System.out.println("Number is not palindrome number");

// 12. HCF Of Two Numbers Program
        // System.out.print("Enter the 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the 2nd number: ");
        // int b = sc.nextInt();
        // int hcf =1;
        // for(int i=1;i<=a || i<=b;i++){
        //         if(a%i==0 && b%i ==0)
        //                 hcf = i;
        // }
        // System.out.println(hcf);


// 13. LCM Of Two Numbers
        // System.out.print("Enter the 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the 2nd number: ");
        // int b = sc.nextInt();
        // int gcd = 1;
        // for(int i=1;i<=a || i<=b;i++){
        //         if(a%i ==0 && b%i ==0){
        //                 gcd = i;
        //         }
        // }
        // int lcm = a*b/gcd;
        // System.out.println(lcm);

// 14. Java Program Vowel Or Consonant
        // System.out.print("Enter the character: ");
        // char ch = sc.next().charAt(0);
        // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         System.out.println(ch + " is a vowel");
        // }
        // else{
        //         System.out.println(ch+" is consonant");
        // }

// 15. Perfect Number In Java
        // System.out.print("Enter the positive number: ");
        // int a = sc.nextInt();
        // int count = 1;
        // int sum =0;
        // int rem = 1;
        // while (a>count) {
        //         if(a%count == 0){
        //                 sum+=count;
        //         }
        //         count++;
        // }
        // if(sum == a){
        //         System.out.println("Perfect number");
        // }
        // else
        //         System.out.println("Not a perfect number");

// 16. Check Leap Year Or Not
        // System.out.print("Enter the year: ");
        // int year = sc.nextInt();
        // if(year%4 == 0 && year%100 != 0 || year%400==0){
        //         System.out.println("Leap year");
        // }
        // else
        //         System.out.println("Not a leap year ");

// 17. Sum Of A Digits Of Number
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int sum = 0;
        // int rem;
        // while (num>0) {
        //         rem = num%10;
        //         sum+=rem;
        //         num/=10;
        // }
        // System.out.println("Sum of digits of number is: "+ sum);

// 18. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
        // int days_in_august = 31;
        // int count = 1;
        // int result=0;
        // int a;

        // while (days_in_august>=count) {
        //         if(count%2==0){
        //                 a=1;
        //                 result+=a;
        //         }
                
        //         count++;
        // }
        // System.out.println(result);

// 19. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        int sum_of_negative_number = 0;
        int sum_of_positive_even_number = 0;
        int sum_of_positive_odd_number = 0;
        while (N!=0) {
                
                if(N<0){
                        sum_of_negative_number +=N;
                }
                else if(N>0 && N%2==0){
                        sum_of_positive_even_number+=N;
                }
                else{
                        sum_of_positive_odd_number+=N;
                }
                System.out.print("Enter the number: ");
                N = sc.nextInt();
                        
        }
        System.out.println("Sum of negative number: "+ sum_of_negative_number);
        System.out.println("Sum of positive even number: "+ sum_of_positive_even_number);
        System.out.println("Sum of positive odd number: "+ sum_of_positive_odd_number);

        sc.close();
    }
}


