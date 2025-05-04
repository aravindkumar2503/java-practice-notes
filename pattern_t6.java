import java.util.Scanner;

class Pattern_t6
	{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) { // Start i from 0
            for (int j = 0; j < n; j++) { // j < n
                if (j == n - i - 1||i==n-1) {
                    // Print left edge of the pyramid
                    System.out.print("* ");
                } else if (j == n - 1) {
                    // Print the right edge of the pyramid for the last row
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
