public class Kilos2Pounds {
    public static void main(String[] args) {
        double kilos = 0;
        double pounds = 0;
        
        // display conversions
        System.out.println("Kilograms\tPounds");
        while (kilos < 200) {
            kilos += 5;
            pounds = kilos * 2.2;
            System.out.println(kilos + "\t\t" + pounds);
        }
    }
}