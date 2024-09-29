/*
                * 
             *    * 
          *          * 
       *               * 
    *                     * 
       *****************



*/

public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 1; j--) {
                System.out.print("   ");
            }
            // Print stars and spaces between
            System.out.print("*");
            if (i > 0) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("   ");
                }
                System.out.print("   *");
            }
            System.out.println();
        }
        
        // Bottom row with stars
        for (int i = 0; i <= 2 * n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}







