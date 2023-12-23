import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int id = sc.nextInt();
        
        switch(id){
            case 1:
            System.out.println("Ashish ");
            break;
            case 2: 
            System.out.println("Rahul");
            break;
            case 3:
            System.out.println("Enter the Department: ");
            String department = sc.next();
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                
                    case "CS":
                        System.out.println("Cs Department");
                    default:
                        System.out.println("No department ");
                        break;
                }
                break;
            default:
                System.out.println("Error");
        }
    }
}
