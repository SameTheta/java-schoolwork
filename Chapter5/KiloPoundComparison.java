public class KiloPoundComparison {
    public static void main(String[] args) {
        //initializes variables
        int kilos = 1;
        double kilo2lbs = 0;
        int pounds = 20;
        double lbs2kilo = 0;
        int i = 0;
        final double POUND_KILO_CONVERSION = 2.2;
        
        //title
        System.out.println("Kilograms\tPounds\t|  Pounds\tKilograms");

        while (i < 20) {
            //does all the calculations
            kilo2lbs = kilos * POUND_KILO_CONVERSION;
            lbs2kilo = pounds / POUND_KILO_CONVERSION;

            //main format
            System.out.printf("%d\t\t%.2f\t|  %d\t\t%.2f\n", kilos, kilo2lbs, pounds, lbs2kilo);
            
            //increments
            kilos += 5;
            pounds += 5;
            i++;
        }
    }
}