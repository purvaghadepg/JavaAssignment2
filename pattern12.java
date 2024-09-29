/*
             1 
          2 3 
       3 4 5 
    4 5 6 7 
 5 6 7 8 9
*/

public class pattern12 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            // Print numbers starting from the row number
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
