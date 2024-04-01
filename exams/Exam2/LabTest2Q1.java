import java.util.Scanner;

public class LabTest2Q1 {
    public static int solveQuadratic(double[] eqn) {
        double determinant = ((eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]));
        double[] roots = {0, 0};
        int rootCount = 0;

        if (determinant > 0) {
            roots[0] = ((-eqn[1] + Math.pow(determinant, 0.5)) / (eqn[0] * 2));
            roots[1] = ((-eqn[1] - Math.pow(determinant, 0.5)) / (eqn[0] * 2));
            rootCount = 2;
        } else if (determinant == 0) {
            roots[0] = ((-eqn[1] - Math.pow(determinant, 0.5)) / (eqn[0] * 2));
            rootCount = 1;
        } else {
            rootCount = 0;
        }

        return rootCount;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] coefficients = new double[3];

        System.out.println("Please put in the coefficents as they appear in the quadratic formula (a, b, c).");
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = input.nextDouble();
        }   
        
        input.close();

        System.out.println("This equation has " + solveQuadratic(coefficients) + " root(s).");
    }
}
