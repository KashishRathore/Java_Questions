import java.util.Scanner;

public class Practice_12_Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = sc.nextInt();
        int size = number;

        int fact = 1;
        while(size > 0){
            fact = fact * size;
            size--;
        }
        System.out.println("The Factorial of " + number + " is " + fact);
    }
}