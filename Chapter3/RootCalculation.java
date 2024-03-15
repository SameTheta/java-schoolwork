import java.util.Scanner;

public class RootCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double root1 = 0; 
        double root2 = 0;
        
        System.out.println("Enter a, b, c: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        double determinant = ((b * b) - (4 * a * c));
        System.out.println(determinant);

        if (determinant > 0) {
            root1 = ((-b + Math.pow(determinant, 0.5)) / (a * 2));
            root2 = ((-b - Math.pow(determinant, 0.5)) / (a * 2));
            System.out.println("Root(s): ");
            System.out.println(root1 + " " + root2);
        } else if (determinant == 0) {
            root1 = ((-b - Math.pow(determinant, 0.5)) / (a * 2));
            System.out.println("Roots: ");
            System.out.println(root1);
        } else {
            System.out.println("No roots.");
        }
        
        input.close();
    }
}