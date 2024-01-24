public class Practice_21_Pyramid_Star_Pattern {
    public static void main(String[] args) {
     /*         *
               ***
              *****
             *******

             loop run       space loop run        print loop run
             1st Run         3 times                1 times
             2nd Run         2 times                3 times
             3rd Run         1 times                5 times
             4th Run         x                      7 times
      */         

      int n = 4;    //Size
      int z = 1;    //print control
      for(int i = 1 ; i <= n ; i++){
        for(int j = n-1 ; j >= i ; j--){         
            // space loop
            System.out.print(" ");
        }  
        for(int k = 1 ; k <= z ; k++){
            // Print loop
            System.out.print("*");
        }
        z = z + 2;
        System.out.println();
      }
    }
}