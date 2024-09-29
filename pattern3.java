/*
A B C D
B C D E
C D E F
D E F G
*/

public class pattern3 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (char i = 'A'; i <= 'D'; i++) {
            // Inner loop for each column
            for (char j = i; j < i + 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
