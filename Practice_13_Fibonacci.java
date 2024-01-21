import java.util.Scanner;

public class Practice_13_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term , fib1 = 0 , fib2 = 1 , fib3;
        System.out.println("Enter the Term : ");
        term = sc.nextInt();
        for(int i = 1 ; i <= term ; i++){
            System.out.print(fib1+ " ");
            fib3 = fib1 + fib2 ;
            fib1 = fib2 ;
            fib2 = fib3 ;

        }
    }
}
