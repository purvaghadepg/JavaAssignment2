/*
1
2    2
3    3    3
4    4    4    4
5    5    5    5    5

*/

public class pattern6 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 1; i <= 5; i++) {
            // Inner loop to print the same number
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "    ");
            }
            System.out.println();
        }
    }
}
