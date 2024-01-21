import java.util.Scanner;

public class Practice_10_Reverse_While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. :");
        int Number = sc.nextInt();

        while(Number != 0){
            System.out.println(Number);
            Number--;
        }
    }

}