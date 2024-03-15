import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float celsius = input.nextFloat();

        float fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(fahrenheit);

        input.close();
    }
}
