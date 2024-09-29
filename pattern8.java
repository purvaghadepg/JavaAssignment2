/*
1
2    3
3    4    5
4    5    6    7
5    6    7    8    9

*/

public class pattern8 {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 1; i <= 5; i++) {
            int num = i;
            // Inner loop to print numbers starting from i
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + "    ");
            }
            System.out.println();
        }
    }
}
