package J1;

// Abstract class Shape1
abstract class Shape1 {
    // Abstract methods for area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Circle1 class extending Shape1
class Circle1 extends Shape1 {
    private double radius;

    // Constructor to initialize the radius
    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class L6 {
    public static void main(String[] args) {
        System.out.println("Abstract Shapes Program");

        // Create a Circle1 object with radius 5.0
        Circle1 c1 = new Circle1(5.0);

        // Print area and perimeter
        System.out.println("Area of the circle: " + c1.calculateArea());
        System.out.println("Perimeter of the circle: " + c1.calculatePerimeter());
    }
}