public class Practice_3_Unary {
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result); // 1

        result--;
        System.out.println(result); // 0

        result++;
        System.out.println(result); // 1

        result = -result;
        System.out.println(result); // -1

        boolean success = false;
        System.out.println(success); //false

        //Another example

        int i = 3;
        i++;
        System.out.println(i);  // 4
        ++i;
        System.out.println(i);  // 5
        System.out.println(++i); // 6
        System.out.println(i++); // 6
        System.out.println(i);  //7
    }
}
