public class FanClassDesign {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        
        myFan.setPower(true);
        myFan.setSpeed(myFan.MEDIUM);

        System.out.print(myFan.toString());
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;

    private double radius = 5;
    String color = "blue";

    Fan() { // creates a default fan
    }

    public String toString() {
        if (on) {
            return (speed + " " + color + " " + radius);
        } else {
            return (color + " " + radius + " fan is off");
        }
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void setPower(boolean powerStatus) {
        on = powerStatus;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getPower() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}