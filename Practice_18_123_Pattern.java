import java.util.Scanner;

public class Practice_18_123_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows : ");
        int row = sc.nextInt();

        for(int i = 1 ; i <= row ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }
}