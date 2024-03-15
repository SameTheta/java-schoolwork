public class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 10000 prime numbers are \n");
        
        for (int i = 0; i < 10000; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }
    
    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }    
    return true; // number is prime
   }
}