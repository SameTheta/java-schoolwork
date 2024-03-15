public class EApproximation {
    public static void main(String[] args) {
        double e = 1.0;
        double term = 1.0;

        for (int i = 1; i <= 20; i++) {
            term /= i;
            e += term;
        }

        System.out.println(e);
    }
}