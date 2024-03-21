import java.util.Scanner;

public class LocateLargestElement {
    public static int[] largestElement(double[][] a){
        int[] location = new int[2];
        double max = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        } 

        location[0] = maxRow;
        location[1] = maxCol;

        return location;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rows and columns for this matrix. ");
        int inRow = input.nextInt();
        int inCol = input.nextInt();

        double[][] userMatrix = new double[inRow][inCol];

        System.out.println("Please enter your matrix."); // get elements from matrix
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix[i].length; j++) {
                userMatrix[i][j] = input.nextDouble();
            }
        }

        input.close();

        int[] elementLocation = largestElement(userMatrix);

        System.out.println("The largest element is located at (" + elementLocation[0] + ", " + elementLocation[1] + ")");
    }
}