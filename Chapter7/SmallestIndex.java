import java.util.Scanner;

public class SmallestIndex {
    public static int indexOfSmallestNumber(int[] array) {
        int min = array[1];

        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] userArray = new int[10];

        System.out.println("Please give 10 numbers.");
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = input.nextInt();
        }

        input.close();

        System.out.println(indexOfSmallestNumber(userArray));
    }
}