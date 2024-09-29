/*
               1 
           2      3 
        4      5       6 
    7      8       9        10 
11      12      13     14      15

*/


public class pattern13 {
    public static void main(String[] args) {
        int num = 1;
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int j = 5; j > i; j--) {
                System.out.print("   ");
            }
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num++ + "   ");
            }
            System.out.println();
        }
    }
}

