/*
* * * * *
* * * *
* * *
* *
*

*/

public class pattern14 {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 5; i >= 1; i--) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



