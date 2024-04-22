
public class TestCars {
    public static void main(String[] args) {
        FancyCar car1 = new FancyCar();

        car1.drive(50);

        System.out.println("======CAR1======");
        checkOdoGas(car1);
        checkModelMPG(car1);

        System.out.println("======CAR2:======");
        FancyCar car2 = new FancyCar("65 Mustang", 29.5);
        car2.drive(50);
        checkOdoGas(car2);
        checkModelMPG(car2);

        System.out.println("======CAR2 starts engine and drive 100 miles:");
        car2.honkHorn();
        car2.startEngine();
        car2.drive(100);
        checkOdoGas(car2);

        System.out.println("======CAR2 stop engine and add 5 gallon gas:");
        car2.stopEngine();
        car2.addGas(5);
        checkOdoGas(car2);

        System.out.println("======CAR2 try drive another 500 miles but run out of gas:");
        car2.honkHorn();
        car2.startEngine();
        car2.drive(500);
        checkOdoGas(car2);

        System.out.println("======CAR2 add another 5 gallon gas:");
        car2.addGas(5);
        checkOdoGas(car2);

        System.out.println("======CAR2 try drive another 100 miles but engine is off:");
        car2.stopEngine();
        car2.drive(100);
        checkOdoGas(car2);

        System.out.println("======CAR2 now turns on the engine and drive the 100 miles but engine is off:");
        car2.honkHorn();
        car2.startEngine();
        car2.drive(100);
        checkOdoGas(car2);
    }

    public static void checkOdoGas(FancyCar car){
        System.out.println("Miles driven: " + car.checkOdometer());
        System.out.println("Gas Tank: " + car.checkGasGauge() + " gallons");
    }

    public static void checkModelMPG(FancyCar car){
        System.out.println("MPG: " + car.getMPG());
        System.out.println("Model: " + car.getModel());
    }


}

class FancyCar {
    //amount of gas the car can hold
    final private double gasTankCapacity = 14.0;

    //changing variables
    private static int milesDriven;
    private static double gasLeft;
    private static double milesPerGallon;
    private static String carModel;
    private boolean engineStatus;

    FancyCar() {
        milesDriven = 5;
        gasLeft = gasTankCapacity;
        milesPerGallon = 24;
        engineStatus = false;
        carModel = "Old Clunker";
    }

    FancyCar(String model, double mpg) {
        milesDriven = 5;
        gasLeft = gasTankCapacity;
        milesPerGallon = mpg;
        engineStatus = false;
        carModel = model;
    }

    public double checkGasGauge() {
        return gasLeft;
    }

    public int checkOdometer() {
        return milesDriven;
    }

    public String getModel() {
        return carModel;
    }

    public double getMPG() {
        return milesPerGallon;
    }

    public void honkHorn() {
        System.out.println("The " + carModel + " says beep beep!");
    }

    public void drive(double distance) {
        if (engineStatus) {
            if (distance > 0) {
                double gasPotential = distance / milesPerGallon;
                if (gasLeft < gasPotential) {
                    milesDriven += gasLeft * milesPerGallon;
                    gasLeft = 0;
                    engineStatus = false;
                } else {
                    milesDriven += distance;
                    gasLeft -= gasPotential;
                }
            }
        }
    }

    public void addGas(double amountOfGas) {
        if (engineStatus == false) {
            if (amountOfGas > 0) {
                gasLeft += amountOfGas;
            }
    
            if (gasLeft > gasTankCapacity) {
                gasLeft = gasTankCapacity;
            }
        }
    }

    public void startEngine() {
        engineStatus = true;
    }

    public void stopEngine() {
        engineStatus = false;
    }

}