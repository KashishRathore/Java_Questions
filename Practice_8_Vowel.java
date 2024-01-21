import java.util.Scanner;

public class Practice_8_Vowel {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the aiphabet :");
        ch = sc.next().charAt(0);
        System.out.println("Entered Character : " + ch);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;
        
            default:
                System.out.println(ch + " is not a vowel");
                break;
        }
    }
    
}
