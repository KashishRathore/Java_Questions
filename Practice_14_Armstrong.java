import java.util.Scanner;

public class Practice_14_Armstrong {
    public static void main(String[] args) {
        //Armstrong 3 digit numbers
        int number , remainder ;
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        number = sc.nextInt();
        int num = number;
        
        while(number != 0){
            remainder = number % 10 ;
            number = number / 10 ;
            sum = sum + remainder * remainder * remainder ;
        }

        if(sum == num){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}
