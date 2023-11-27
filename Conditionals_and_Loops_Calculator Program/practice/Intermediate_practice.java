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
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();




        sc.close();
    }
}

/*
 * 16. Reverse A String In Java
 * 17. Find if a number is palindrome or not
 * 18. Future Investment Value
 * 19. HCF Of Two Numbers Program
 * 20. LCM Of Two Numbers
 * 21. Java Program Vowel Or Consonant
 * 22. Perfect Number In Java
 * 23. Check Leap Year Or Not
 * 24. Sum Of A Digits Of Number
 * 25. Kunal is allowed to go out with his friends only on the even days of a
 * given month. Write a program to count the number of days he can go out in the
 * month of August.
 * 26. Write a program to print the sum of negative numbers, sum of positive
 * even numbers and the sum of positive odd numbers from a list of numbers (N)
 * entered by the user. The list terminates when the user enters a zero.
 */
