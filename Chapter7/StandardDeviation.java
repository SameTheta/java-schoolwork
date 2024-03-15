import java.util.Scanner;

public class StandardDeviation {
    public static double deviation(double[] x, double mean) {
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - mean, 2);
        }

        return Math.sqrt(sum / (x.length - 1));
    }

    public static double mean(double[] x) {
        double sum = 0;

        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (sum / x.length);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] userArray = new double[10];
        
        System.out.println("Please type 10 numbers.");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = input.nextDouble();
        }

        input.close();

        double mean = mean(userArray);
        double deviation = deviation(userArray, mean);

        System.out.println("The mean of the numbers given is: " + mean);
        System.out.println("The deviation of the numbers given is: " + deviation);
    }
}