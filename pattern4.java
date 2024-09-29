/*
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0

*/

public class pattern4 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 0; i < 4; i++) {
            // Inner loop for each column
            for (int j = 0; j < 4; j++) {
                // Check if sum of row and column index is even or odd
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
