import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i-1][j-1] = i * j;
            }
        }

        System.out.println("\nThe matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
        }
        System.out.println("\nsum1 (main diagonal) = " + sum1);

        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1){
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println("sum2 (special elements) = " + sum2);
    }
}
