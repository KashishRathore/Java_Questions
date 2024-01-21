import java.util.Scanner;

public class Practice_11_Reversing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        int Remainder;
        System.out.println("The Reverse of the number : ");
        while (number != 0) {
            Remainder = number % 10 ;
            int Quotient = number / 10;
            number = Quotient ;
            System.out.print(Remainder);
        } 
    }
}
