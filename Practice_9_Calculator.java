import java.util.Scanner;

public class Practice_9_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second Number :");
        int number2 = sc.nextInt();

        System.out.println("Enter 1 for Addition ");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter the Number :");

        int operation = sc.nextInt();

        switch (operation) {
            case 1: 
               int result = number1 + number2 ;
               System.out.println("The Addition of number 1 and number 2 is : " + result);
               break;

            case 2: 
               result = number1 - number2 ;
               System.out.println("The Subtraction of number 1 and number 2 is : " + result);
               break;

            case 3: 
               result = number1 * number2 ;
               System.out.println("The Multiplication of number 1 and number 2 is : " + result);
               break;

            case 4: 
               result = number1 / number2 ;
               System.out.println("The Division of number 1 and number 2 is : " + result);
               break;
        
            default:
                System.out.println("Enter correct operator");
                break;
        }
    }
}
