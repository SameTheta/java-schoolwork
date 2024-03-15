class LabTest1Q1A {
    public static void main(String[] args) {
        double numerator = 1.0;
        double denominator = 1.0;
        int isNegative = 1;
        double sum = 0;

        while (denominator <= 28) {
            sum += (numerator / (denominator * denominator)) * isNegative;

            numerator += 2;
            denominator += 3;
            isNegative = isNegative * -1;
        }

        System.out.println("The sum is " + sum);
    }
}