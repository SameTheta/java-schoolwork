package Chapter8;

import java.util.Scanner;

public class SumColumns {
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] inputMatrix = new double[3][4];

        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                inputMatrix[i][j] = input.nextDouble();
            }
        }

        input.close();

        for (int i = 0; i < inputMatrix[0].length; i++) {
            System.out.println("Sum of elements at column " + i + " is " + sumColumn(inputMatrix, i));
        }
    }
}