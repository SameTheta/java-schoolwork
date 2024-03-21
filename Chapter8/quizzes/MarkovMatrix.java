import java.util.Scanner;

public class MarkovMatrix {
    public static boolean isMarkovMatrix(double[][] matrix) {
        for (int column = 0; column < matrix.length; column++) {
            double sum = 0;

            // check sums of column
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }

            if (sum != 1.0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] inputMatrix = new double[3][3];

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                inputMatrix[i][j] = input.nextDouble();
            }
        }

        input.close();

        System.out.println("This matrix is a " + isMarkovMatrix(inputMatrix) + " Markov matrix");
    }
}