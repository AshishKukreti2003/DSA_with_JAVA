import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// 1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.](https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html)
        // System.out.print("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter the second number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter the third number: ");
        // int c = sc.nextInt();
        // max(a,b,c);
        // min(a, b, c);

// 2. [Define a program to find out whether a given number is even or odd.](https://www.geeksforgeeks.org/java-program-to-check-if-a-given-integer-is-odd-or-even/)
        // System.out.print("Enter the number: ");
        // int a = sc.nextInt();
        // evenORodd(a);

// 3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)
        // System.out.print("Enter your Age: ");
        // int age = sc.nextInt();
        // eligible(age);

// 4. [Write a program to print the sum of two numbers entered by user by defining your own method.](https://code4coding.com/addition-of-two-numbers-in-java-using-method/)
        // System.out.print("Enter the 1st number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter the 1st number: ");
        // int num2 = sc.nextInt();
        // int sum_ = sum(num1, num2);
        // System.out.println("Sum of "+num1+" and "+num2+" is: "+sum_);

// 5. [Define a method that returns the product of two numbers entered by user.](https://code4coding.com/java-program-to-multiply-two-numbers-using-method/)
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int result = product(a, b);
        // System.out.println("Product of "+a+ " and "+b+" is: "+result);

// 6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.](https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)
        // double r = sc.nextInt();
        // double result = circumference(r);
        // System.out.println("Circumference of a Circle is: "+ result);

// 7. [Define a method to find out if a number is prime or not.](https://www.geeksforgeeks.org/java-program-to-check-if-a-number-is-prime-or-not/)
        // if(primeORnot(5)){
        //     System.out.println("Prime number");
        // }
        // else{
        //     System.out.println("Not a prime number");
        // }

// 8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) 
// Marks        Grade 
// 91-100         AA 
// 81-90          AB 
// 71-80          BB 
// 61-70          BC 
// 51-60          CD 
// 41-50          DD 
// <=40          Fail 
        // System.out.print("Enter your marks (out of 100): ");
        // int marks = sc.nextInt();
        // Grade(marks);

// 9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
        // Factorial(4);

// 10. [Write a function to find if a number is a palindrome or not. Take number as parameter.](https://www.geeksforgeeks.org/check-if-a-number-is-palindrome/)
        // Palindrome(12121);

// 11. [Write a function to check if a given triplet is a Pythagorean triplet or not.](https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/) (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        // PythagoreanTriplet(9,12,15);

// 12. [Write a function that returns all prime numbers between two given numbers.](https://www.geeksforgeeks.org/program-to-find-prime-numbers-between-given-interval/)
        for(int i=1;i<=10;i++){
            if(AllPrime(i)){
                System.out.print(i+ " ");
            }
        }
        
// 13. [Write a function that returns the sum of first n natural numbers.](https://www.geeksforgeeks.org/program-find-sum-first-n-natural-numbers/)
        // SumOfNatural(5);

        sc.close();
    }

    static void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+ " is a maximum number");
        }
        else if(b>a && b>c){
            System.out.println(b+ " is a maximum number");
        }
        else{
            System.out.println(c+ " is a maximum number");
        }
    }
    static void min(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a+ " is a minimum number");
        }
        else if(b<a && b<c){
            System.out.println(b+ " is a minimum number");
        }
        else
            System.out.println(c+ " is a minimum number");
    }

    static void evenORodd(int a){
        if(a%2==0){
            System.out.println(a+ " is a even number");
        }
        else
            System.out.println(a+ " is odd number");
    }

    static void eligible(int a){
        if(a>=18){
            System.out.println("Eligible to vote");
        }
        else
            System.out.println("Not Eligible to vote");
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int product(int a, int b){
        return a*b;
    }

    static double circumference(double r){
        return 2*Math.PI*r;
    }

    static boolean primeORnot(int a){
        for(int i=2;i<a;i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    static void Grade(int marks){
        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        } else if (marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    static void Factorial(int n){
        int count =1;
        int pro = 1;
        while (n>=count) {
            pro*=count;
            count++;
        }
        System.out.println(pro);
    }

    static void Palindrome(int n){
        int org = n;
        int result = 0;
        while (n>0) {
            int rem = n%10;
            result = result*10+rem;
            n /= 10;
        }
        if(result == org){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }
    }

    static void PythagoreanTriplet(int a, int b, int c){
        int a_2 = a*a;
        int b_2 = b*b;
        int c_2 = c*c;
        int sum = a_2 + b_2;
        if( sum == c_2){
            System.out.println("Given number are Pythagorean triplet");
        }
        else{
            System.out.println("Given number are not Pythagorean triplet");
        }
    }

    static boolean AllPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void SumOfNatural(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }

}