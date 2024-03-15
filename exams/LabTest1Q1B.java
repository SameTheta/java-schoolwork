public class LabTest1Q1B {
    public static void main(String[] args) {
        double numerator = 1.0;
        double denominator = 1.0;
        double sum = 0;

        while (denominator <= 28) {
            sum += (numerator / (denominator * denominator));

            numerator += 2;
            denominator++;
        }

        System.out.println("The sum is " + sum);
    }
}