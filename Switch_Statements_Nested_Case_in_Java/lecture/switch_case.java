import java.util.*;

public class switch_case {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit: ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Orange":
                System.out.println("Roud fruit");
                break;
            case "Apple":
                System.out.println("Red friut");
                break;
            case "Grapes":
                System.out.println("Green Friut");
                break;
            default:
                System.out.println("Please enter valid input");
        }

        System.out.println("Enter the day 1-7: " );
        int day = sc.nextInt();

        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter the valid number");
        }
    }
}
