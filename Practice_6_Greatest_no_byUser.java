import java.util.Scanner;

public class Practice_6_Greatest_no_byUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int number1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println("Number 1 is greater than Number 2");
        }
        else{
            System.out.println("Number 2 is greater than Number 1");          
        }
    }
}
