import java.util.Scanner;

public class RectanglePosition {
    public static void main(String[] args) {
        // init scanner
        Scanner input = new Scanner(System.in);

        // init variables for rectangle
        System.out.println("Enter the rectangle's width.");
        int rectWidth = input.nextInt();

        System.out.println("Enter the rectangle's length.");
        int rectLength = input.nextInt();

        // init variables for user check
        System.out.println("Enter a point on the X axis.");
        int userPointX = input.nextInt();
        
        System.out.println("Enter a point on the Y axis");
        int userPointY = input.nextInt();

        if((userPointX <= rectWidth / 2) && (userPointY <= rectLength / 2)) {
            // if user point is within rectangle
            System.out.println("Point (" + userPointX + ", " + userPointY + ") is in the rectangle");
        } else {
            // if user point is not within rectangle
            System.out.println("Point (" + userPointX + ", " + userPointY + ") is not in the rectangle");
        }

        input.close();
    }
}