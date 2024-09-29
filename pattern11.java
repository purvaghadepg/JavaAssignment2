/*
               * 
           *      * 
        *      *       * 
    *      *        *       * 
*       *      *       *       *


*/

public class pattern11 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print("   ");
            }
            // Print stars with spaces between
            for (int k = 1; k <= i; k++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
