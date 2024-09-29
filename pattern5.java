/*
*
*    *
*    *    *
*    *    *    *
*    *    *    *    *

*/



public class pattern5 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*    ");
            }
            System.out.println();
        }
    }
}
