import java.util.Scanner;

public class Basic_Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
// 1. Area Of Circle Java Program
        // int radius_of_circle = 5;
        // double area_of_circle = Math.PI*radius_of_circle*radius_of_circle;
        // System.out.println("Area of Circle is: "+ area_of_circle);

// 2. Area Of Triangle
        // int base_of_triangle = 5;
        // int height_of_triangle = 7;
        // int area_of_triangle = (base_of_triangle*height_of_triangle)/2;
        // System.out.println("Area of the triangle is: "+ area_of_triangle);

// 3. Area Of Rectangle Program 
        // int length_of_rect = 5;
        // int width_of_rect = 3;
        // int area_of_rect = length_of_rect*width_of_rect;
        // System.out.println("Area of the Rectangle is: "+ area_of_rect);

// 4. Area Of Isosceles Triangle 
        // int base_of_triangle = 5;
        // int height_of_triangle = 7;
        // int area_of_isosceles_triangle = (base_of_triangle*height_of_triangle)/2;
        // System.out.println("Area of the Isosceles triangle is: "+ area_of_isosceles_triangle);

// 5. Area Of Parallelogram
        // int base_of_parallelogram = 6;
        // int height_of_parallelogram = 14;
        // int area_of_parallelogram = base_of_parallelogram* height_of_parallelogram;
        // System.out.println("Area of the parallelogram is: "+ area_of_parallelogram);

// 6. Area Of Rhombus
        // int diagonal1_of_rhombus = 9;
        // int diagonal2_of_rhombus = 5;
        // int area_of_rhombus = (diagonal1_of_rhombus*diagonal2_of_rhombus)/2;
        // System.out.println("Area of Rhombus is: "+ area_of_rhombus);

// 7. Area Of Equilateral Triangle
        // int side_of_triangle = 6;
        // double area_of_equilateral_triangle= (Math.sqrt(3)*side_of_triangle*side_of_triangle)/4;
        // System.out.println("Ares of Equilateral Triangle is: "+ area_of_equilateral_triangle );

// 8. Perimeter Of Circle
        // int radius_of_circle = 5;
        // double Perimeter_of_circle = 2*Math.PI*radius_of_circle;
        // System.out.println("Perimeter of Circle is: "+ Perimeter_of_circle);

// 9. Perimeter Of Equilateral Triangle
        // int side= 9;
        // int Perimeter_of_Equilateral_Triangle = 3*side;
        // System.out.println("Perimeter Of Equilateral Triangle is: "+ Perimeter_of_Equilateral_Triangle);

// 10. Perimeter Of Parallelogram
        // int side1 = 56;
        // int side2 = 67;
        // int Perimeter_Of_Parallelogram = 2*(side1+side2);
        // System.out.println("Perimeter Of Parallelogram is: "+ Perimeter_Of_Parallelogram);

// 11. Perimeter Of Rectangle
        // int length = 5;
        // int width = 7;
        // int Perimeter_Of_Rectangle = 2*(length+width);
        // System.out.println("Perimeter Of Parallelogram is: "+ Perimeter_Of_Rectangle);

// 12. Perimeter Of Square
        // int side = 5;
        // int perimeter_of_square = 4*side;
        // System.out.println("Perimeter of Square is: "+ perimeter_of_square); 

// 13. Perimeter Of Rhombus
        // int side = 9;
        // int perimeter_of_rhombus = 4*side;
        // System.out.println("Perimeter of Square is: "+ perimeter_of_rhombus); 

// 14. Volume Of Cone Java Program
        // int radius = 7;
        // int height = 9;
        // double volume_of_cone = (Math.PI*radius*radius*height)/3;
        // System.out.println("Volume of Cone is: "+ volume_of_cone);

// 15. Fibonacci Series In Java Programs
        // System.out.print("Enter the number: ");
        // int num = sc.nextInt();
        // int a= 0,b=1,temp;
        // for(int i=0;i<=num;i++){
        //         System.out.println(a+" ");
        //         temp = a+b;
        //         a=b;
        //         b=temp;
        // }

// 16. Input a number and print all the factors of that number (use loops).
        // System.out.print("Enter the input: ");
        // int input = sc.nextInt();
        // for(int i=1;i<=input;i++){
        //         if(input%i==0){
        //                 System.out.print(i+" ");
        //         }
        // }
        
// 17. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        // int sum =0;
        // int number;
        // System.out.println("Enter zero(0) to stop");
        // do{
        //         System.out.println("Enter the number: ");
        //         number = sc.nextInt();
        //         sum+=number;
        // }while(number!=0);
        // System.out.print("The sum of all numbers is: "+ sum);

// 18. Take integer inputs till the user enters 0 and print the largest number from all.
       int largest = Integer.MIN_VALUE;
       int number;
       System.out.println("Enter zero(0) to stop");
       do{
                System.out.println("Enter the number: ");
                number= sc.nextInt();
                if(number>largest && number!=0){
                        largest=number;
                }
       }while(number!=0);

        // System.out.println("The largest number is: "+ largest);
        if (largest != Integer.MIN_VALUE) {
                System.out.println("The largest number entered is: " + largest);
        } else {
                System.out.println("No valid number entered.");
        }

        sc.close();
    }
}