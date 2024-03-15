public class PerfectNumbers {
    public static void main(String[] args) {
        int sum;        
        for (int i = 1; i < 10000; i++) {
            sum = 0;
            for (int divisor = 1; divisor < i; divisor++) {
                if (i % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == i) {
                System.out.println("Perfect number found! " + i);
            }
        }
    }
}