public class PentagonalNumber {
    public static int getPentagonalNumber(int n) {
        int pentNumber = n * ((3 * n) - 1) / 2;

        return pentNumber;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 10) {
            for (int k = 1; k <= 10; k++) {
                System.out.printf("%7d ", getPentagonalNumber(k + i));
            }
            System.out.println();
        }
    }
}