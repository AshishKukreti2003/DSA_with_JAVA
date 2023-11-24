import java.util.Scanner;

public class Intermediate_practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// 1. Factorial Program In Java
        // int num = 10;
        // int result =1;
        // int count =1;
        // while(num>=count){
        //         result*=count;
        //         count++;
        //     }
        //     System.out.println(result);

// 2. Calculate Average Of N Numbers
        // double num = sc.nextDouble();
        // double sum =0;
        // int count =0;
        // while(num>count){
        //     double value = sc.nextDouble();
        //     sum+=value;
        //     count++;
        // }
        // double avg = sum/num;
        // System.out.println(avg);

// 3. Calculate Discount Of Product
        // double originalPrice = 100.0; // Original price of the product
        // double discountPercentage = 40.0; // Discount percentage

        // double discount = originalPrice * (discountPercentage / 100);
        // System.out.println("The discount on the product is: $" + discount);

// 4. Calculate Distance Between Two Points 
        int point1 = 100;
        int point2 = 120;
        int Distance;
        if(point1>point2){
            Distance = point1 - point2;
        }
        else
            Distance = point2 - point1;
        System.out.println("The Distance Between "+ point1 +" and "+ point2+" is: "+ Distance);


    }
}

/*
6. Calculate Commission Percentage
7. Power In Java
8. Calculate Depreciation of Value
9. Calculate Batting Average
10. Calculate CGPA Java Program
11. Compound Interest Java Program
12. Calculate Average Marks
13. Sum Of N Numbers
14. Armstrong Number In Java
15. Find Ncr & Npr
16. Reverse A String In Java
17. Find if a number is palindrome or not 
18. Future Investment Value
19. HCF Of Two Numbers Program
20. LCM Of Two Numbers
21. Java Program Vowel Or Consonant 
22. Perfect Number In Java
23. Check Leap Year Or Not
24. Sum Of A Digits Of Number
25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero. */
