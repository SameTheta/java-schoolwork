import java.util.Scanner;

public class SmallestIndex {
    public static int indexOfSmallestNumber(double[] array) {
        int min = 0;

        for (int i = 0; i < array.length; i++){
            if (array[min] > array[i]) {
                min = i;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] userArray = new double[10];

        System.out.println("Please give 10 numbers.");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = input.nextDouble();
        }

        input.close();

        System.out.println(indexOfSmallestNumber(userArray));
    }
}