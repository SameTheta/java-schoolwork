public class RepresentRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 Data:"); // print rect1 data
        System.out.println(rect1.width);
        System.out.println(rect1.height);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        System.out.println("\nRectangle 2 Data");
        System.out.println(rect2.width);
        System.out.println(rect2.height);
        System.out.println(rect2.getArea());
        System.out.println(rect2.getPerimeter());
    }
}

class Rectangle {
    // class attributes
    double width = 1;
    double height = 1;
    
    Rectangle() {
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return (width * 2) + (height * 2);
    }
}
