/*
1 2 3 4 5 6
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6


*/

public class pattern17 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 6; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = i; k <= 6; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}







