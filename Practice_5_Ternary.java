public class Practice_5_Ternary { 
    public static void main(String[] args) {
        // Finding the greatest no. among three
        int a = 10;
        int b = 20;
        int c = 30;
        int large = a > b ? (a > c ? a : c ) : (b > c ? b : c);
        System.out.println(large);
    }
}
