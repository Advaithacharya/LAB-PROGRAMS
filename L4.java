package J1;

class MyPoint {
    private int x;
    private int y;

    // Default constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    // Method to set x and y coordinates
    public void setXY(int x1, int y1) {
        this.x = x1;
        this.y = y1;
    }

    // Method to get x and y coordinates as an array
    public int[] getXY() {
        int[] coordinates = {x, y};
        return coordinates;
    }

    // Method to calculate distance from this point to another point (x1, y1)
    public double distance(int x1, int y1) {
        int xDiff = this.x - x1;
        int yDiff = this.y - y1;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from this point to another MyPoint object
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate distance from this point to origin (0, 0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Override toString method to display point as a string
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class L4 {
    public static void main(String[] args) {
        System.out.println("MyPoint Program");

        // Creating MyPoint objects
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(3, 4);

        // Setting coordinates for p1
        p1.setXY(1, 2);

        // Getting coordinates of p1
        int[] coordinates = p1.getXY();
        System.out.println("Coordinates of p1: " + coordinates[0] + ", " + coordinates[1]);

        // Calculating distances
        System.out.println("Distance from p1 to (5, 6): " + p1.distance(5, 6));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to origin: " + p1.distance());

        // Printing point details using toString
        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
    }
}