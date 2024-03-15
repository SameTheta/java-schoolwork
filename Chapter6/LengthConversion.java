public class LengthConversion {
    public static double Feet2Meters(double feet) {
        return feet * 0.305;
    }

    public static double Meters2Feet(double meters) {
        return meters * 3.279;
    }

    public static void main(String[] args) {
        int foot = 1;
        int meter = 20;

        System.out.println("Feet\tMeters\t\tMeters\tFeet");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.3f\t\t%d\t%.3f\n", foot, Feet2Meters(foot), meter, Meters2Feet(meter));
            
            // increase measurements
            foot++;
            meter += 5;
        }
    }
}