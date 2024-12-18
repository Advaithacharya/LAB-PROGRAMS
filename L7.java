package J1;

// Interface Resizable
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Rectangle class implementing Resizable
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to resize width
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Method to resize height
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Method to display the dimensions of the rectangle
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Main class
public class L7 {
    public static void main(String[] args) {
        System.out.println("Resizable Rectangle Program");

        // Create a rectangle with width 5 and height 10
        Rectangle r1 = new Rectangle(5, 10);
        r1.display();

        // Resize the rectangle
        r1.resizeWidth(8);
        r1.resizeHeight(12);
        r1.display();
    }
}