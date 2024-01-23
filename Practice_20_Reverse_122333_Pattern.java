import java.util.Scanner;

public class Practice_20_Reverse_122333_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows : ");
        int row = sc.nextInt();

        for(int i = row ; i > 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
        System.out.println();
        }
    }
}
