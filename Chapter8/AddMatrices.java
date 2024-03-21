import java.util.Scanner;

public class AddMatrices {
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sums = new double[3][3];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sums[i][j] = a[i][j] + b[i][j];
            }
        }

        return sums;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] inputMatrix1 = new double[3][3];
        double[][] inputMatrix2 = new double[3][3];

        System.out.println("Enter matrix 1."); // get matrix input 1
        for (int i = 0; i < inputMatrix1.length; i++) {
            for (int j = 0; j < inputMatrix1[i].length; j++) {
                inputMatrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter matrix 2."); // get matrix input 2
        for (int i = 0; i < inputMatrix1.length; i++) {
            for (int j = 0; j < inputMatrix1[i].length; j++) {
                inputMatrix2[i][j] = input.nextDouble();
            }
        }

        input.close();

        double[][] matrixSums = addMatrix(inputMatrix1, inputMatrix2);

        System.out.println("The sum of the matrices is");
        for (int i = 0; i < matrixSums.length; i++) {
            for (int j = 0; j < matrixSums[i].length; j++) {
                System.out.print(matrixSums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
