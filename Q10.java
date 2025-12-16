import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("\nThe matrix is:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += matrix[i][i];
        }
        System.out.println("\nsum1 (main diagonal) = " + sum1);

        int sum2 = 0;
        if (n >= 2) {
            sum2 += matrix[0][n - 1];       
            sum2 += matrix[n - 2][n - 2];   
            sum2 += matrix[n - 1][0];       
        }
        System.out.println("sum2 (special elements) = " + sum2);
    }
}
