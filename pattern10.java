/*
                 * 
                ** 
               *** 
              **** 
             ***** 
            ******

*/

public class pattern10 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 6; i++) {
            // Print leading spaces
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
