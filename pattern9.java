/*
1
0    0
1    1    1
0    0    0    0
1    1    1    1    1

*/

public class pattern9 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 1; i <= 5; i++) {
            // Determine what number to print (either 0 or 1 based on row number)
            int num = (i % 2 == 0) ? 0 : 1;
            // Inner loop to print the number i times
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "    ");
            }
            System.out.println();
        }
    }
}


/* output
1
0    0
1    1    1
0    0    0    0
1    1    1    1    1
*/