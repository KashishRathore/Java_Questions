import java.util.Scanner;

public class Practice_7_Leap_Year {
    public static void main(String[] args) {
        //Leap Year
        // divisible by 4 
        // divisible by 400
        // not divisible by 100

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");   
        }
    }
}
